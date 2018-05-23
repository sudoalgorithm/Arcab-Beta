package ae.arcab.arcab.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import ae.arcab.arcab.R;

public class NameActivity extends AppCompatActivity {

    private static final String HEADING = "What’s Your Name?";
    private static final String FIRST = "first name";
    private static final String LAST = "last name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        init();
    }

    public void init(){

        int fontSize = 30;
        int fontSize2 = 20;
        int fontSize3 = 14;
        int textSizeFour = 18;

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Colfax-Medium.otf");

        TextView textView = (TextView) findViewById(R.id.text_view_name);
        textView.setText(HEADING);
        textView.setTextSize(fontSize);
        textView.setTypeface(typeface);
        textView.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));

        EditText editText1 = (EditText) findViewById(R.id.et_first_name_activity);
        editText1.setTypeface(typeface);
        editText1.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        editText1.setTextSize(fontSize2);


        EditText editText2 = (EditText) findViewById(R.id.et_last_name_activity);
        editText2.setTypeface(typeface);
        editText2.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        editText2.setTextSize(fontSize2);


        TextView textView2 = (TextView) findViewById(R.id.text_view_name_activity_one);
        textView2.setText(FIRST);
        textView2.setTextSize(fontSize3);
        textView2.setTypeface(typeface);
        textView2.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        textView2.setAllCaps(true);

        TextView textView3 = (TextView) findViewById(R.id.text_view_name_activity_second);
        textView3.setText(LAST);
        textView3.setTextSize(fontSize3);
        textView3.setTypeface(typeface);
        textView3.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        textView3.setAllCaps(true);

        ImageButton imageButton = (ImageButton) findViewById(R.id.img_btn_back_name);
        imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        imageButton.setBackgroundColor(ContextCompat.getColor(this,R.color.colorText));

        Button button = (Button) findViewById(R.id.btn_next_screen_name);
        button.setText("Next");
        button.setAllCaps(false);
        button.setTextColor(ContextCompat.getColor(this,R.color.colorText));
        button.setTypeface(typeface);
        button.setTextSize(textSizeFour);
        button.setStateListAnimator(null);


    }

    public void onBackClickName(View view){
        startActivity(new Intent(NameActivity.this, VerificationActivity.class));
    }

    public void onNextClickName(View view){
        startActivity(new Intent(NameActivity.this, EmailActivity.class));
    }
}
