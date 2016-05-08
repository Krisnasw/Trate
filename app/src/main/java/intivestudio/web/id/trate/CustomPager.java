package intivestudio.web.id.trate;

/**
 * Created by outattacker on 08/05/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomPager extends Fragment{

    public static final String PAGE = "page";
    ViewGroup viewGroup;
    ImageView imageView;
    TextView textView, rego;
    Button beli;

    public CustomPager() {
// TODO Auto-generated constructor stub
    }

    public static CustomPager create(int page) {

        CustomPager customPager = new CustomPager();
        Bundle data = new Bundle();
        data.putInt(PAGE, page);
        customPager.setArguments(data);
        return customPager ;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewGroup = (ViewGroup) inflater.inflate(R.layout.slide_layout, container, false);
        imageView = (ImageView) viewGroup.findViewById(R.id.imageView);
        textView = (TextView) viewGroup.findViewById(R.id.textView1);
        rego = (TextView) viewGroup.findViewById(R.id.harga);
        beli = (Button) viewGroup.findViewById(R.id.beli);

        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getContext(), Cart.class);
                startActivity(q);
            }
        });

        switch (getArguments().getInt(PAGE)) {

            case 0:
                imageView.setImageResource(R.drawable.greentea);
                textView.setText("Greentea Santai memiliki rasa unik yaitu Thai Tea rasa Greentea, ada beberapa varian rasa, original, taro dan greentea");
                rego.setText("Harga : Rp. 8000");
                break;
            case 1:
                imageView.setImageResource(R.drawable.mars);
                textView.setText("Makanan yang kenyal-kenyal, marsmallow dicampur dengan beberapa bahan khusus yang di produksi melalui teknologi muktahir");
                rego.setText("Harga : Rp. 8000");
                break;
            case 2:
                imageView.setImageResource(R.drawable.ori);
                textView.setText("Original Santai memiliki rasa unik yaitu Thai Tea rasa Original, ada beberapa varian rasa, original, taro dan greentea");
                rego.setText("Harga : Rp. 8000");
                break;

            default:
                break;
        }

        return viewGroup;
    }

}
