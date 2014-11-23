package cn.edu.gdmec.s07131020.demo_drawableanimation;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private ImageView imageView;
    private AnimationDrawable drawable;
    private Button button;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView=(ImageView)findViewById(R.id.imageView1);
		button=(Button)findViewById(R.id.button1);
		
		imageView.setBackgroundResource(R.drawable.drawable_animation);
	    drawable = (AnimationDrawable)imageView.getBackground();
	
	    button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				drawable.start();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
