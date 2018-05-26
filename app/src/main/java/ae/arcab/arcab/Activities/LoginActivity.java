package ae.arcab.arcab.Activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ae.arcab.arcab.Utils.FontUtil;
import ae.arcab.arcab.R;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG_LINE = "Move" + "\n" + "Together.";
    private static final String BTN_CONTACT_NUMBER_TEXT = "Enter with Mobile Number";
    private static final String BTN_CONTACT_SOCIAL_MEDIA = "Enter with Social Account";
    private static final String POLICY_TEXT = "Read arcab Privacy and Safety Policy, Payments Policy, Terms of Use.";
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }


    private void init(){

        TextView textView = (TextView) findViewById(R.id.txt_view_login);
        textView.setText(TAG_LINE);
        textView.setTextSize(32);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        ImageView imageView = (ImageView) findViewById(R.id.img_view_login);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.arcab_light));

        Button btnContactNumber = (Button) findViewById(R.id.btn_mobile_number);
        btnContactNumber.setText(BTN_CONTACT_NUMBER_TEXT);
        btnContactNumber.setAllCaps(false);
        btnContactNumber.setTextSize(18);
        btnContactNumber.setTextColor(ContextCompat.getColor(mContext,R.color.colorText));
        btnContactNumber.setTypeface(FontUtil.getColfaxMedium(mContext));
        btnContactNumber.setStateListAnimator(null);

        Button btnSocialMedia = (Button) findViewById(R.id.btn_social_media);
        btnSocialMedia.setText(BTN_CONTACT_SOCIAL_MEDIA);
        btnSocialMedia.setAllCaps(false);
        btnSocialMedia.setTextSize(18);
        btnSocialMedia.setTextColor(ContextCompat.getColor(mContext,R.color.colorTextPink));
        btnSocialMedia.setTypeface(FontUtil.getColfaxMedium(mContext));
        btnSocialMedia.setStateListAnimator(null);

        TextView textView1 = (TextView) findViewById(R.id.txt_view_login_policy);
        textView1.setText(POLICY_TEXT);
        textView1.setTypeface(FontUtil.getColfaxRegular(mContext));
        textView1.setTextSize(16);
        textView1.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

    }

    public void onContactBtnClick(View view){
        startActivity(new Intent(LoginActivity.this, ContactNumberActivity.class));
    }

    public void onSocialBtnClick(View view){
        startActivity(new Intent(LoginActivity.this, SocialAccountActivity.class));
    }
}
