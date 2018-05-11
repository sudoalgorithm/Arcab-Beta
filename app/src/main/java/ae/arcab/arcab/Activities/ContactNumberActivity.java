package ae.arcab.arcab.Activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import ae.arcab.arcab.R;

public class ContactNumberActivity extends AppCompatActivity {

    private static final String HEADING = "Your Number?";
    private static final String COUNTRY_CODE = "AE +971";
    private static final String TEXT = "mobile number";
    private static final String TEXT_TWO = "Your mobile number is only used for authentication and will not be shared with anyone.";
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_number);
        init();
    }

    public void init(){

        int textSize = 30;
        int textSizeTwo = 20;
        int textSizeThree = 14;
        int textSizeFour = 18;
        int textSizeFive = 16;

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/Colfax-Medium.otf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/Colfax-Regular.otf");

        TextView textView = (TextView) findViewById(R.id.txt_view_contact_number);
        textView.setText(HEADING);
        textView.setTextSize(textSize);
        textView.setTypeface(typeface);
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        TextView textView1 = (TextView) findViewById(R.id.txt_view_contact_number_country);
        textView1.setText(COUNTRY_CODE);
        textView1.setTextSize(textSizeTwo);
        textView1.setTypeface(typeface);
        textView1.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextDarkGrey));

        TextView textView2 = (TextView) findViewById(R.id.txt_view_contact_number_divider);
        textView2.setText("|");
        textView2.setTextSize(textSizeTwo);
        textView2.setTypeface(typeface);
        textView2.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextDarkGrey));

        EditText editText = (EditText) findViewById(R.id.txt_view_contact_number_number);
        editText.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        editText.setInputType(InputType.TYPE_CLASS_PHONE);
        editText.setTextSize(textSizeTwo);
        editText.setTypeface(typeface);

        TextView textView3 = (TextView) findViewById(R.id.txt_view_contact_number_text);
        textView3.setText(TEXT);
        textView3.setTextSize(textSizeThree);
        textView3.setTypeface(typeface);
        textView3.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        textView3.setAllCaps(true);

        TextView textView4 = (TextView) findViewById(R.id.txt_view_contact_number_text_two);
        textView4.setText(TEXT_TWO);
        textView4.setTextSize(textSizeFive);
        textView4.setTypeface(typeface1);
        textView4.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        textView4.setAllCaps(false);

        ImageButton imageButton = (ImageButton) findViewById(R.id.img_btn_back);
        imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        imageButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorText));

        Button button = (Button) findViewById(R.id.btn_next_screen);
        button.setText("Next");
        button.setAllCaps(false);
        button.setTextColor(ContextCompat.getColor(mContext,R.color.colorText));
        button.setTypeface(typeface);
        button.setTextSize(textSizeFour);

    }

    public void onBackClick(View view){
        startActivity(new Intent(ContactNumberActivity.this, LoginActivity.class));
    }

    public void onNextClick(View view){
        startActivity(new Intent(ContactNumberActivity.this, VerificationActivity.class));
    }
}
