package ae.arcab.arcab.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import ae.arcab.arcab.Utils.FontUtil;
import ae.arcab.arcab.R;

public class NameActivity extends AppCompatActivity {

    private static final String HEADING = "What’s Your Name?";
    private static final String FIRST = "first name";
    private static final String LAST = "last name";
    private Context mContext = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        init();
    }

    public void init(){

        TextView textView = (TextView) findViewById(R.id.text_view_name);
        textView.setText(HEADING);
        textView.setTextSize(30);
        textView.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));

        EditText editText1 = (EditText) findViewById(R.id.et_first_name_activity);
        editText1.setTypeface(FontUtil.getColfaxMedium(mContext));
        editText1.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        editText1.setTextSize(20);

        EditText editText2 = (EditText) findViewById(R.id.et_last_name_activity);
        editText2.setTypeface(FontUtil.getColfaxMedium(mContext));
        editText2.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        editText2.setTextSize(20);

        TextView textView2 = (TextView) findViewById(R.id.text_view_name_activity_one);
        textView2.setText(FIRST);
        textView2.setTextSize(14);
        textView2.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView2.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        textView2.setAllCaps(true);

        TextView textView3 = (TextView) findViewById(R.id.text_view_name_activity_second);
        textView3.setText(LAST);
        textView3.setTextSize(14);
        textView3.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView3.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        textView3.setAllCaps(true);

        ImageButton imageButton = (ImageButton) findViewById(R.id.img_btn_back_name);
        imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        imageButton.setBackgroundColor(ContextCompat.getColor(this,R.color.colorText));

        Button button = (Button) findViewById(R.id.btn_next_screen_name);
        button.setText("Next");
        button.setAllCaps(false);
        button.setTextColor(ContextCompat.getColor(this,R.color.colorText));
        button.setTypeface(FontUtil.getColfaxMedium(mContext));
        button.setTextSize(18);
        button.setStateListAnimator(null);
    }

    public void onBackClickName(View view){
        startActivity(new Intent(NameActivity.this, VerificationActivity.class));
    }

    public void onNextClickName(View view){
        startActivity(new Intent(NameActivity.this, EmailActivity.class));
    }
}
