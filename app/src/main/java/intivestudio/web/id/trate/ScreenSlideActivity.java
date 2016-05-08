package intivestudio.web.id.trate;

/**
 * Created by outattacker on 08/05/16.
 */
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ScreenSlideActivity extends ActionBarActivity implements OnClickListener {

    ViewPager viewPager ;
    ImageView buttonKiri, buttonKanan;
    ViewPagerAdapter viewPagerAdapter ;
    int page = 0 ;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hayai Food");

        initObject();
        initComponentViews();
        initConfigurationView();
        initOnImplementsView();

    }

    private void initObject(){
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    }

    private void initComponentViews(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        buttonKiri = (ImageView) findViewById(R.id.buttonKiri);
        buttonKanan = (ImageView) findViewById(R.id.buttonKanan);

    }

    private void initConfigurationView(){
        viewPager.setAdapter(viewPagerAdapter);
    }

    private void initOnImplementsView(){
        buttonKiri.setOnClickListener(this);
        buttonKanan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.buttonKiri:

                page -= 1;

                viewPager.setCurrentItem(page);
                if (page<=0) {
                    buttonKiri.setVisibility(Button.INVISIBLE);
                }else{
                    buttonKiri.setVisibility(Button.VISIBLE);
                }
                if (page==1) {
                    buttonKanan.setVisibility(Button.VISIBLE);
                }
                break;

            case R.id.buttonKanan:
                page += 1;
                viewPager.setCurrentItem(page);

                if (page>=ViewPagerAdapter.PAGER_LENGTH) {
                    buttonKanan.setVisibility(Button.INVISIBLE);
                }else{
                    buttonKiri.setVisibility(Button.VISIBLE);
                }
                if (page==1) {
                    buttonKiri.setVisibility(Button.VISIBLE);
                }
                break;

            default:
                break;
        }
    }
}
