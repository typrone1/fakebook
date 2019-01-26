package dev.huuty.fakebook.activity;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dev.huuty.fakebook.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.framelayout)
    FrameLayout framelayout;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigation;

//    NewsFeedFragment newsFeedFragment;
//    NotificationFragment notificationFragment;
//    FriendsFragment friendsFragment;
    @BindView(R.id.search)
    ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        bottomNavigation.inflateMenu(R.menu.bottom_navigation_main);
        bottomNavigation.setItemBackgroundResource(R.color.colorPrimary);
        bottomNavigation.setItemTextColor(ContextCompat.getColorStateList(bottomNavigation.getContext(), R.color.nav_item_colors));
        bottomNavigation.setItemIconTintList(ContextCompat.getColorStateList(bottomNavigation.getContext(), R.color.nav_item_colors));
//        BottomNavigationViewHelper.removeShiftMode(bottomNavigation);
//
//        newsFeedFragment = new NewsFeedFragment();
//        notificationFragment = new NotificationFragment();
//        friendsFragment = new FriendsFragment();
//
//        Bundle bundle = getIntent().getExtras();
//        String isFromNotification = "false";
//        if(bundle !=null){
//            isFromNotification = getIntent().getExtras().getString("isFromNotification","false");
//            if(isFromNotification.equals("true")){
//                bottomNavigation.getMenu().findItem(R.id.profile_notification).setChecked(true);
//                setFragment(notificationFragment);
//            }else{
//                setFragment(newsFeedFragment);
//            }
//        }else{
//            setFragment(newsFeedFragment);
//        }


//        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.newsfeed_fragment:
//                        setFragment(newsFeedFragment);
//                        break;
//
//                    case R.id.profile_fragment:
//                        startActivity(new Intent(MainActivity.this, ProfileActivity.class).putExtra("uid", FirebaseAuth.getInstance().getCurrentUser().getUid()));
//                        break;
//
//                    case R.id.profile_friends:
//                        setFragment(friendsFragment);
//                        break;
//
//                    case R.id.profile_notification:
//                        setFragment(notificationFragment);
//                        break;
//
//                }
//                return true;
//            }
//        });
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, UploadActivity.class));
//            }
//        });

    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }

    @OnClick(R.id.search)
    public void onViewClicked() {
//        startActivity(new Intent(MainActivity.this,SearchActivity.class));
    }
}
