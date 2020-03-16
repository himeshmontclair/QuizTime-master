package com.example.android.quiztime;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

   public  static int final_Score;
    private ImageView status_img;
    private TextView score_txt;
    private Button HomePage_btn;
    private Button review_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        findViewes();
        scoreForQuize();
    }

    private void findViewes() {
        status_img=(ImageView)findViewById(R.id.status_img);
        score_txt=(TextView)findViewById(R.id.score_txt);

        HomePage_btn=(Button)findViewById(R.id.HomePage_btn);
        HomePage_btn.setOnClickListener(this);

        review_btn=(Button)findViewById(R.id.review_btn);
        review_btn.setOnClickListener(this);
    }

    private void scoreForQuize() {
         final_Score=0;
        if(Utilities.First_Ans.equals("Jupiter")){
            final_Score=final_Score+1;
        }else {
            final_Score=final_Score;
        }

        if(Utilities.Second_Ans.equals("Dog")){
            final_Score=final_Score+1;
        }else {
            final_Score=final_Score;
        }

        if(Utilities.Third_Ans.equals("Smallpox")){
            final_Score=final_Score+1;
        }else {
            final_Score=final_Score;
        }

        if(Utilities.Fourth_Ans.equals("40")){
            final_Score=final_Score+1;
        }else {
            final_Score=final_Score;
        }

        if(Utilities.Fifth_Ans.equals("Boston, MA")){
            final_Score=final_Score+1;
        }else {
            final_Score=final_Score;
        }

        setImage(final_Score);
        //Toast.makeText(getApplication(),final_Score+"/5",Toast.LENGTH_SHORT).show();
    }

    private void setImage(int score) {
        String text="<html><body><font color=#91A1AB> <small> You Scored </small> </font> <font color=#826FDB><big> "+ score + "/5" + "</big> </font> </body><html>";

        score_txt.setText(Html.fromHtml( text));

        if(score==5){
            status_img.setBackgroundResource(R.drawable.congrats);
        }else if(score>=3){
            status_img.setBackgroundResource(R.drawable.maybenext);
            Toast.makeText(getApplicationContext(),"you scored "+score+"/5 better luck next time",Toast.LENGTH_LONG).show();
        }else {
            status_img.setBackgroundResource(R.drawable.poor_perorm);
        }
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.HomePage_btn:
                Intent start = new Intent(ResultActivity.this, HomeActivity.class);
                startActivity(start);
                finish();
                break;

            case R.id.review_btn:
                Intent start1 = new Intent(ResultActivity.this, ReviewActivity.class);
                startActivity(start1);
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }
}
