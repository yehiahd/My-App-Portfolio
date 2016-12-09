package udacity.nanodegree.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.popular_movies) Button popularMovies;
    @Bind(R.id.stock_hawk) Button stockHawk;
    @Bind(R.id.build_it_bigger) Button buildItBigger;
    @Bind(R.id.make_your_app_material) Button makeYourAppMaterial;
    @Bind(R.id.go_ubiquitous) Button goUbiquitous;
    @Bind(R.id.parent_layout) LinearLayout parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setListeners();
    }

    private void setListeners() {
        for (int i = 0; i < parentLayout.getChildCount();i++){
            parentLayout.getChildAt(i).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "This button will launch my "+((Button)view).getText()+" project", Toast.LENGTH_SHORT).show();
    }
}
