package com.example.sqliteexam;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText id, name, qty;
MyDbAdapter helper;
Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=(EditText) findViewById(R.id.ptxtId);
        name=(EditText) findViewById(R.id.ptxtProduct);
        qty=(EditText) findViewById(R.id.ptxtQty);
        helper =new MyDbAdapter(this);
    }
    public void saveProduct(View view){
        Product product=new Product(name.getText().toString(), Integer.parseInt(qty.getText().toString()));
        long i=helper.insertData(product);
        if (i<0){
            Message.messages(this,"Unsccessful");
        }else {
            Message.messages(this,"Successful");
        }
    }
    public void getProductByPrductId(View view){
        int pid=Integer.parseInt(id.getText().toString().trim());
        Product p=helper.findProductById(pid);
        if (p != null){
            name.setText(p.getProductname());
            qty.setText(String.valueOf((p.getQuantity())));
        }else {
            Toast.makeText(this, "No Data Exists ", Toast.LENGTH_SHORT).show();
        }
    }
    public void deleteProductByProductId(View view){
        int pid=Integer.parseInt(id.getText().toString().trim());
        helper.deleteProduct(pid);
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }
}
