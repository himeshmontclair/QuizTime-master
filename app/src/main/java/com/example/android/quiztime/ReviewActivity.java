package com.example.android.quiztime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ReviewActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Home_page_btn;
    private ImageView back_img;
    private TextView first_ans_txt,second_ans_txt,third_ans_txt,fourth_ans_txt,fifth_ans_txt;
    String first_selcted_ans,second_selcted_ans,third_selcted_ans,fourth_selcted_ans,five_selcted_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        findViewes();
        setAnswers();
    }



    private void findViewes() {
        Home_page_btn=(Button)findViewById(R.id.Home_page_btn);
        Home_page_btn.setOnClickListener(this);

        back_img=(ImageView)findViewById(R.id.back_img);
        back_img.setOnClickListener(this);

        first_ans_txt=(TextView)findViewById(R.id.first_ans_txt);
        second_ans_txt=(TextView)findViewById(R.id.second_ans_txt);
        third_ans_txt=(TextView)findViewById(R.id.third_ans_txt);
        fourth_ans_txt=(TextView)findViewById(R.id.fourth_ans_txt);
        fifth_ans_txt=(TextView)findViewById(R.id.fifth_ans_txt);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.Home_page_btn:
                Intent start = new Intent(ReviewActivity.this, HomeActivity.class);
                startActivity(start);
                finish();
                break;

            case R.id.back_img:
                finish();
                break;
        }
    }

    private void setAnswers() {
      //first
        if(Utilities.First_Ans.equals("Jupiter")){
            first_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#008000>"+ Utilities.First_Ans + " </font> </body><html>";
        }else {
            first_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#AD1F2D>"+ Utilities.First_Ans + " </font> </body><html>";
        }
        first_ans_txt.setText(Html.fromHtml( first_selcted_ans));

        //Second
        if(Utilities.Second_Ans.equals("Dog")){
            second_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#008000>"+ Utilities.Second_Ans + " </font> </body><html>";
        }else {
            second_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#AD1F2D>"+ Utilities.Second_Ans + " </font> </body><html>";
        }
        second_ans_txt.setText(Html.fromHtml( second_selcted_ans));

        //Third
        if(Utilities.Third_Ans.equals("Smallpox")){
            third_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#008000>"+ Utilities.Third_Ans + " </font> </body><html>";
        }else {
            third_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#AD1F2D>"+ Utilities.Third_Ans + " </font> </body><html>";
        }
        third_ans_txt.setText(Html.fromHtml( third_selcted_ans));


        //Fourth
        if(Utilities.Fourth_Ans.equals("40")){
            fourth_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#008000>"+ Utilities.Fourth_Ans + " </font> </body><html>";
        }else {
            fourth_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#AD1F2D>"+ Utilities.Fourth_Ans + " </font> </body><html>";
        }
        fourth_ans_txt.setText(Html.fromHtml( fourth_selcted_ans));

        //Fiftrh
        if(Utilities.Fifth_Ans.equals("Boston, MA")){
            five_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#008000>"+ Utilities.Fifth_Ans + " </font> </body><html>";
        }else {
            five_selcted_ans="<html><body><font color=#000>  Your Answer     :  </font> <font color=#AD1F2D>"+ Utilities.Fifth_Ans + " </font> </body><html>";
        }
        fifth_ans_txt.setText(Html.fromHtml( five_selcted_ans));
    }
}
