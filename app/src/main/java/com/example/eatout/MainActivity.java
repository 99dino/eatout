package com.example.eatout;


import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CheckBox pizza,burger,coffee,fries,softdrink;
    private Button buy;
    private int totalCost;
    private String order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza=(CheckBox) findViewById(R.id.pizza);

        burger=(CheckBox) findViewById(R.id.burger);

        coffee=(CheckBox) findViewById(R.id.coffee);

        fries=(CheckBox) findViewById(R.id.fries);

        softdrink=(CheckBox) findViewById(R.id.softdrink);

//        pizza - 199/-
//        Burger - 99/-
//        Coffee - 79/-
//        Fries - 99/-
//        Soft Drink - 50/-

        buy=(Button) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                totalCost=0;
                order="";
                if(pizza.isChecked()){
                    totalCost+=199;
                    order+="Pizza(+199)\n";
                }if(burger.isChecked()){
                    totalCost+=99;
                    order+="Burger(+99)\n";
                }if(coffee.isChecked()){
                    totalCost+=79;
                    order+="Coffee(+79)\n";
                }if(fries.isChecked()){
                    totalCost+=99;
                    order+="Fries(+99)\n";
                }if(softdrink.isChecked()){
                    totalCost+=50;
                    order+="Soft Drink(+50)\n";
                }
                order=order.concat("Total Cost : ");
                order=order.concat(Integer.toString(totalCost));

                CharSequence text = order;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
            }
        });

    }
}