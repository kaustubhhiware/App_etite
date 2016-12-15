package com.learning.kaustubh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String sign = "";
    public Double tempDouble, tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create buttons
        Button button0 =(Button)findViewById(R.id.button0);
        Button button1 =(Button)findViewById(R.id.button1);
        Button button2 =(Button)findViewById(R.id.button2);
        Button button3 =(Button)findViewById(R.id.button3);
        Button button4 =(Button)findViewById(R.id.button4);
        Button button5 =(Button)findViewById(R.id.button5);
        Button button6 =(Button)findViewById(R.id.button6);
        Button button7 =(Button)findViewById(R.id.button7);
        Button button8 =(Button)findViewById(R.id.button8);
        Button button9 =(Button)findViewById(R.id.button9);

        Button buttonC =(Button)findViewById(R.id.buttonC);
        Button buttoneq =(Button)findViewById(R.id.buttoneq);

        //operators button
        Button buttonp =(Button)findViewById(R.id.buttonp);
        Button buttonmi =(Button)findViewById(R.id.buttonmi);
        Button buttonmul =(Button)findViewById(R.id.buttonmul);
        Button buttondiv =(Button)findViewById(R.id.buttondiv);
        Button buttonback =(Button)findViewById(R.id.buttonback);

        // Button 0
        button0.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        // Button 1
        button1.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );

        // Button 2
        button2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );

        // Button 3
        button3.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );

        // Button 4
        button4.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );

        // Button 5
        button5.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );

        // Button 6
        button6.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );

        // Button 7
        button7.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );

        // Button 8
        button8.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );

        // Button 9
        button9.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );

        // Button Addition
        buttonp.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        if(output.getText() != "") {
                            tempDouble = Double.parseDouble(output.getText().toString());
                            output.setText("0");
                            sign = "+";
                        }
                    }
                }
        );

        // Button Subtraction
        buttonmi.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        if(output.getText() !="") {
                            tempDouble = Double.parseDouble(output.getText().toString());
                            output.setText("0");
                            sign = "-";
                        }
                    }
                }
        );

        // Button Multiplication
        buttonmul.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        if(output.getText() != "") {
                            tempDouble = Double.parseDouble(output.getText().toString());
                            output.setText("0");
                            sign = "*";
                        }
                    }
                }
        );

        // Button Division
        buttondiv.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        if(output.getText() != "" ) {
                            tempDouble = Double.parseDouble(output.getText().toString());
                            output.setText("0");output.setText("0");
                            sign = "/";
                        }

                    }
                }
        );

        // Button Back
        buttonback.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        if(output.getText()==""){ output.setText("0");}
                        else {
                            String s = output.getText().toString();
                            if(s.length() == 1 ){output.setText("0");}
                            else{output.setText(s.substring(0,s.length()-1));}
                        }
                    }
                }
        );

        // Button Clear
        buttonC.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("0");
                    }
                }
        );

        // Button Equals
        buttoneq.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if(output.getText() != " ") {
                            if (sign == "+") {
                                output.setText(Double.toString(tempDouble + tempDouble2));
                            } else if (sign == "-") {
                                output.setText(Double.toString(tempDouble - tempDouble2));
                            } else if (sign == "*") {
                                output.setText(Double.toString(tempDouble * tempDouble2));
                            } else if (sign == "/") {
                                if (tempDouble2 == 0) {
                                    // Cannot Divide By Zero
                                    output.setText("Cannot Divide By Zero!");
                                    output.setText("0.0");
                                } else {
                                    output.setText(Double.toString(tempDouble / tempDouble2));
                                }
                            }
                        }
                        // Reset the Sign variable
                        sign = "";

                    }
                }
        );

    }


}
