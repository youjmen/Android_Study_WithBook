package com.example.retrofitretry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText InputId;
    Button Search;
    TextView userId;
    TextView followers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputId = findViewById(R.id.ID);
        Search = findViewById(R.id.Search);
        userId = findViewById(R.id.userId);
        followers = findViewById(R.id.followers);
    }
    public void onSearch(View v){
        Log.d("executed","onSearch");
        String id = InputId.getText().toString();
        if(!id.isEmpty()){
            Call<JsonParse> res = GitHubApi.getInstance().getService().getInfo(id);
            res.enqueue(new Callback<JsonParse>() {
                @Override
                public void onResponse(Call<JsonParse> call, Response<JsonParse> response) {
                    Log.d("Retrofit", response.toString());
                    if (response.code() == 200) {
                        if (response.body() != null)
                            userId.setText(response.body().login);
                        followers.setText(Integer.toString(response.body().followers));
                    } else {
                        Log.e("Response Code Error", response.code() + "");
                        makeToast("존재하지 않는 유저입니다");
                        userId.setText("-");
                        followers.setText("-");


                    }

                }

                @Override
                public void onFailure(Call<JsonParse> call, Throwable t) {
                    Log.e("Err", t.getMessage());

                }
            });

        }

    }
    private void makeToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
