package ae.arcab.arcab.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import ae.arcab.arcab.Utils.FontUtil;
import ae.arcab.arcab.R;

public class ContactNumberActivity extends AppCompatActivity {

    private static final String HEADING = "Your Number?";
    private static final String COUNTRY_CODE = "AE +971";
    private static final String TEXT = "mobile number";
    private static final String TEXT_TWO = "Your mobile number is only used for authentication and will not be shared" + "\n" + "with anyone.";
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_number);
        init();
    }

    public void init(){

        TextView textView = (TextView) findViewById(R.id.txt_view_contact_number);
        textView.setText(HEADING);
        textView.setTextSize(30);
        textView.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        TextView textView1 = (TextView) findViewById(R.id.txt_view_contact_number_country);
        textView1.setText(COUNTRY_CODE);
        textView1.setTextSize(20);
        textView1.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView1.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextDarkGrey));

        TextView textView2 = (TextView) findViewById(R.id.txt_view_contact_number_divider);
        textView2.setText("|");
        textView2.setTextSize(20);
        textView2.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView2.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextDarkGrey));

        EditText editText = (EditText) findViewById(R.id.txt_view_contact_number_number);
        editText.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        editText.setInputType(InputType.TYPE_CLASS_PHONE);
        editText.setTextSize(20);
        editText.setTypeface(FontUtil.getColfaxMedium(mContext));

        TextView textView3 = (TextView) findViewById(R.id.txt_view_contact_number_text);
        textView3.setText(TEXT);
        textView3.setTextSize(14);
        textView3.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView3.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        textView3.setAllCaps(true);

        TextView textView4 = (TextView) findViewById(R.id.txt_view_contact_number_text_two);
        textView4.setText(TEXT_TWO);
        textView4.setTextSize(16);
        textView4.setTypeface(FontUtil.getColfaxRegular(mContext));
        textView4.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        textView4.setAllCaps(false);

        ImageButton imageButton = (ImageButton) findViewById(R.id.img_btn_back);
        imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        imageButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorText));

        Button button = (Button) findViewById(R.id.btn_next_screen);
        button.setText("Next");
        button.setAllCaps(false);
        button.setTextColor(ContextCompat.getColor(mContext,R.color.colorText));
        button.setTypeface(FontUtil.getColfaxMedium(mContext));
        button.setTextSize(18);
        button.setStateListAnimator(null);

    }

    public void onBackClick(View view){
        startActivity(new Intent(ContactNumberActivity.this, LoginActivity.class));
    }

    public void onNextClick(View view){
        startActivity(new Intent(ContactNumberActivity.this, VerificationActivity.class));
    }
}
