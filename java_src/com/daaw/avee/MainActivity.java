package com.daaw.avee;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.legacy.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewpager.widget.ViewPager;
import com.daaw.avee.Common.Action;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Boast;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.SystemUiHider;
import com.daaw.avee.Common.SystemUiHiderHoneycomb;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.CustomViewPager;
import com.daaw.avee.EventsGlobal.EventsGlobalApp;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.AlbumArt.ImageResult;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.ISearchEntry;
import com.daaw.avee.comp.LibraryQueueUI.Fragment0;
import com.daaw.avee.comp.LibraryQueueUI.Fragment1;
import com.daaw.avee.comp.SleepTimer.SleepTimerConfig;
import com.daaw.avee.comp.VisualUI.Fragment2;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {
    public static final int LIBRARY_PAGE_INDEX = 0;
    private static final int MSG_HIDE = 2;
    private static final int MSG_TICK1 = 4;
    private static final int MSG_TICK10 = 3;
    public static final int QUEUE_PAGE_INDEX = 1;
    public static final int VISUAL_PAGE_INDEX = 2;
    private DrawerLayout drawerLayout;
    private Handler handler;
    PlayerCore playerCore;
    private SectionsPagerAdapter sectionsPagerAdapter;
    private Toast slowClosingToast;
    private SwitchCompat switchLockOrient;
    private SwitchCompat switchSleepTimer;
    private SystemUiHiderHoneycomb systemUiHider;
    private Toolbar toolbar;
    private CustomViewPager viewPager;
    ValueAnimator vizMenuButtonAnimator;
    public static WeakEvent1<Activity> onCreate = new WeakEvent1<>();
    public static WeakEvent1<Activity> onStart = new WeakEvent1<>();
    public static WeakEvent1<Activity> onResume = new WeakEvent1<>();
    public static WeakEvent1<Activity> onPause = new WeakEvent1<>();
    public static WeakEvent1<Activity> onStop = new WeakEvent1<>();
    public static WeakEvent1<ContextData> onDestroy = new WeakEvent1<>();
    public static WeakEvent onExit = new WeakEvent();
    public static WeakEvent2<Integer, Activity> onViewPagerPageSelected = new WeakEvent2<>();
    public static WeakEvent1<Context> onCreateEarly = new WeakEvent1<>();
    public static WeakEvent2<Integer, ContextData> onMainUIAction = new WeakEvent2<>();
    public static WeakEvent4<AlbumArtRequest, ImageLoadedListener, Integer, Integer> onRequestAlbumArtLarge = new WeakEvent4<>();
    public static WeakEventR<SleepTimerConfig> onMainUIRequestSleepTimerConfig = new WeakEventR<>();
    public static WeakEventR<Boolean> onRequestLockOrientState = new WeakEventR<>();
    public static WeakEvent2<Integer, String> onUISearchQueryTextChange = new WeakEvent2<>();
    public static WeakEvent1<Boolean> onUISearchQueryStateChange = new WeakEvent1<>();
    public static WeakEvent1<Integer> onSetCurrentSearchIndex = new WeakEvent1<>();
    public static WeakEventR<ISearchEntry> onRequestCurrentSearchEntry = new WeakEventR<>();
    public static WeakEvent3<View, View, View> onCreateView = new WeakEvent3<>();
    public static WeakEvent2<List<PlaylistSong>, Integer> onPreviewOpen = new WeakEvent2<>();
    public static WeakEvent1<Boolean> onFullscreenChanged = new WeakEvent1<>();
    public static WeakEvent1<Context> onViewPagerSwipeOutAtStart = new WeakEvent1<>();
    public static WeakEvent2<Float, Context> onViewPagerSwipeProgressUpdate = new WeakEvent2<>();
    public static WeakEvent2<Activity, Integer> onRequestPermissionsResult = new WeakEvent2<>();
    public static WeakEventR3<Integer, Integer, Intent, Boolean> onActivityResult0 = new WeakEventR3<>();
    public static WeakEvent2<Integer, Intent> onActivityResult = new WeakEvent2<>();
    public static WeakEventR<PlaylistSong.Data> onRequestTrackInfo = new WeakEventR<>();
    public static WeakEventR<Tuple2<Boolean, Boolean>> onRequestIsPremiumIsPremiumAvailable = new WeakEventR<>();
    public static WeakEventR<Boolean> onRequestShouldShowControls = new WeakEventR<>();
    public static WeakEventR1<Activity, Boolean> onBackPressed = new WeakEventR1<>();
    public static WeakEventR2<ContextData, Intent, Boolean> onLaunchIntent = new WeakEventR2<>();
    public static WeakEventR2<ContextData, Integer, Boolean> onToolbarAction = new WeakEventR2<>();
    static volatile WeakReference<MainActivity> instanceWeak = new WeakReference<>(null);
    public int currentFragmentPage = -1;
    WeakReference<MenuItem> premiumMenuWeak = new WeakReference<>(null);
    private boolean slowClosingInProgress = false;
    private Timer slowClosingTimer = null;
    private MenuItem searchMenuItem = null;
    private MenuItem sleepTimerIndicatorMenuItem = null;
    private MenuItem lockOrientIndicatorMenuItem = null;
    private MenuItem vizBtn0MenuItem = null;
    private MenuItem vizBtn1MenuItem = null;
    private MenuItem vizBtn2MenuItem = null;
    private List<Object> listenerReferenceHolder = new LinkedList();
    private PlaylistSong.Data assignedSongData = PlaylistSong.emptyData;

    public MainActivity() {
        EventsGlobalTextNotifier.onTextMsg.subscribeWeak(new WeakEvent1.Handler<String>() { // from class: com.daaw.avee.MainActivity.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(final String str) {
                if (UtilsUI.IsUiThread()) {
                    if (MainActivity.this.isFinishing()) {
                        return;
                    }
                    Boast.makeText(MainActivity.this, str, 1).show();
                    return;
                }
                MainActivity.this.runOnUiThread(new Runnable() { // from class: com.daaw.avee.MainActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MainActivity.this.isFinishing()) {
                            return;
                        }
                        Boast.makeText(MainActivity.this, str, 1).show();
                    }
                });
            }
        }, this.listenerReferenceHolder);
        this.handler = new Handler(new Handler.Callback() { // from class: com.daaw.avee.MainActivity.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i != 2) {
                    if (i == 3) {
                        EventsGlobalApp.onUITick10.invoke();
                        MainActivity.this.handler.removeMessages(3);
                        MainActivity.this.handler.sendMessageDelayed(MainActivity.this.handler.obtainMessage(3), 10000L);
                    } else if (i == 4) {
                        EventsGlobalApp.onUITick1.invoke();
                        MainActivity.this.handler.removeMessages(4);
                        MainActivity.this.handler.sendMessageDelayed(MainActivity.this.handler.obtainMessage(4), 1000L);
                    }
                } else if (MainActivity.this.currentFragmentPage == 2 && AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_pref_visControlsTimeout)) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.showControls(false, mainActivity.currentFragmentPage);
                }
                return false;
            }
        });
    }

    public static MainActivity getInstance() {
        return instanceWeak.get();
    }

    public static Fragment0 getFragment0Instance() {
        MainActivity mainActivity = instanceWeak.get();
        if (mainActivity == null) {
            return null;
        }
        return (Fragment0) mainActivity.findFragmentByPosition(0);
    }

    public static Fragment1 getFragment1Instance() {
        MainActivity mainActivity = instanceWeak.get();
        if (mainActivity == null) {
            return null;
        }
        return (Fragment1) mainActivity.findFragmentByPosition(1);
    }

    public static Fragment2 getFragment2Instance() {
        MainActivity mainActivity = instanceWeak.get();
        if (mainActivity == null) {
            return null;
        }
        return (Fragment2) mainActivity.findFragmentByPosition(2);
    }

    private Toolbar getToolBar() {
        return this.toolbar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (onLaunchIntent.invoke(new ContextData(this), intent, false).booleanValue()) {
            this.viewPager.setCurrentItem(2);
            onViewPagerPageSelected(2);
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        instanceWeak = new WeakReference<>(this);
        AppPermissions.isPermissionsGranted(getApplicationContext(), this);
        this.playerCore = PlayerCore.s();
        this.sectionsPagerAdapter = null;
        this.viewPager = null;
        try {
            PreferenceManager.setDefaultValues(getApplicationContext(), R.xml.preferences, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        onCreateEarly.invoke(getApplicationContext());
        onCreate.invoke(this);
        setContentView(R.layout.main_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.toolbar = toolbar;
        setSupportActionBar(toolbar);
        UtilsUI.setStatusBarDimensions(findViewById(R.id.viewStatusBarBg));
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setBackgroundColor(UtilsUI.getAttrColorWithAlphaRes(getTheme(), this, R.attr.containerBackground, R.color.white_alpha_1));
        ((TextView) navigationView.getHeaderView(0).findViewById(R.id.nav_version_name)).setText(Utils.getAppVersionName());
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: com.daaw.avee.-$$Lambda$MainActivity$Omt0EhIBoNicXgyrJLwWm_NpyJE
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return MainActivity.this.lambda$onCreate$0$MainActivity(menuItem);
            }
        });
        this.premiumMenuWeak = new WeakReference<>(navigationView.getMenu().findItem(R.id.menu_premium));
        this.switchSleepTimer = (SwitchCompat) navigationView.getMenu().findItem(R.id.menu_sleep_timer).getActionView().findViewById(R.id.drawer_switch);
        this.switchLockOrient = (SwitchCompat) navigationView.getMenu().findItem(R.id.menu_lock_orient).getActionView().findViewById(R.id.drawer_switch);
        this.switchSleepTimer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.avee.-$$Lambda$MainActivity$QxIAKQWMvFeSGtI0xAak5lNXQLo
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.lambda$onCreate$1$MainActivity(compoundButton, z);
            }
        });
        this.switchLockOrient.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.avee.-$$Lambda$MainActivity$aGyIZYEjlGhQ3vaRru5rzQiNo4w
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.lambda$onCreate$2$MainActivity(compoundButton, z);
            }
        });
        onCreateView.invoke(findViewById(R.id.layoutMediaControls), findViewById(R.id.layoutMediaControlsNarrow), findViewById(R.id.layoutMediaControlsContainer));
        this.sectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());
        CustomViewPager customViewPager = (CustomViewPager) findViewById(R.id.viewPager);
        this.viewPager = customViewPager;
        customViewPager.setAdapter(this.sectionsPagerAdapter);
        this.viewPager.setOnSwipeOutListener(new CustomViewPager.OnSwipeOutListener() { // from class: com.daaw.avee.MainActivity.3
            @Override // com.daaw.avee.CustomViewPager.OnSwipeOutListener
            public void onSwipeOutAtEnd() {
            }

            @Override // com.daaw.avee.CustomViewPager.OnSwipeOutListener
            public void onSwipeOutAtStart() {
                MainActivity.onViewPagerSwipeOutAtStart.invoke(MainActivity.this.getApplicationContext());
            }

            @Override // com.daaw.avee.CustomViewPager.OnSwipeOutListener
            public void onSwipeProgressUpdate(float f) {
                MainActivity.onViewPagerSwipeProgressUpdate.invoke(Float.valueOf(f), MainActivity.this.getApplicationContext());
            }
        });
        this.systemUiHider = null;
        SystemUiHiderHoneycomb systemUiHiderHoneycomb = new SystemUiHiderHoneycomb(this.viewPager, 2);
        this.systemUiHider = systemUiHiderHoneycomb;
        systemUiHiderHoneycomb.setup();
        this.systemUiHider.show();
        this.systemUiHider.setOnVisibilityChangeListener(new SystemUiHider.OnVisibilityChangeListener() { // from class: com.daaw.avee.MainActivity.4
            @Override // com.daaw.avee.Common.SystemUiHider.OnVisibilityChangeListener
            public void onVisibilityChange(boolean z) {
                if (z) {
                    MainActivity.this.showControls(MainActivity.onRequestShouldShowControls.invoke(true).booleanValue(), MainActivity.this.currentFragmentPage, true);
                }
            }
        });
        if (onLaunchIntent.invoke(new ContextData(this), getIntent(), false).booleanValue()) {
            this.viewPager.setCurrentItem(2);
            onViewPagerPageSelected(2);
        } else {
            int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_mainPageIndex);
            this.viewPager.setCurrentItem(i);
            onViewPagerPageSelected(i);
        }
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.daaw.avee.MainActivity.5
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                MainActivity.this.onViewPagerPageSelected(i2);
            }
        });
        Message obtainMessage = this.handler.obtainMessage(3);
        this.handler.removeMessages(3);
        this.handler.sendMessageDelayed(obtainMessage, 10000L);
        Message obtainMessage2 = this.handler.obtainMessage(4);
        this.handler.removeMessages(4);
        this.handler.sendMessageDelayed(obtainMessage2, 1000L);
    }

    public /* synthetic */ boolean lambda$onCreate$0$MainActivity(MenuItem menuItem) {
        if (onMenuItemSelected(menuItem)) {
            this.drawerLayout.closeDrawers();
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$onCreate$1$MainActivity(CompoundButton compoundButton, boolean z) {
        if (z) {
            onMainUIAction.invoke(1, new ContextData(this));
        } else {
            onMainUIAction.invoke(10, new ContextData(this));
        }
    }

    public /* synthetic */ void lambda$onCreate$2$MainActivity(CompoundButton compoundButton, boolean z) {
        onMainUIAction.invoke(2, new ContextData(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        onStart.invoke(this);
        super.onStart();
        Message obtainMessage = this.handler.obtainMessage(3);
        this.handler.removeMessages(3);
        this.handler.sendMessageDelayed(obtainMessage, 10000L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        tlog.d("######### onStop");
        super.onStop();
        onStop.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        tlog.d("######### onPause");
        onPause.invoke(this);
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        onResume.invoke(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        tlog.d("######### onDestroy");
        onDestroy.invoke(new ContextData(this));
        setKeepScreenOnLock(false, false);
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        int integer = AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_hold_exit", true) ? getResources().getInteger(R.integer.hold_exit_ms) : 0;
        if (i == 4 && integer > 0) {
            this.slowClosingInProgress = true;
            Toast makeText = Toast.makeText(getApplicationContext(), getString(R.string.hold_exit), 0);
            this.slowClosingToast = makeText;
            makeText.show();
            Timer timer = new Timer();
            this.slowClosingTimer = timer;
            timer.schedule(new TimerTask() { // from class: com.daaw.avee.MainActivity.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    MainActivity.this.slowClosingInProgress = false;
                    MainActivity.this.slowClosingToast.cancel();
                    MainActivity.this.slowClosingTimer.cancel();
                    MainActivity.this.doExit();
                }
            }, integer);
            return true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && this.slowClosingInProgress) {
            this.slowClosingInProgress = false;
            this.slowClosingTimer.cancel();
            this.slowClosingTimer = null;
            this.slowClosingToast.setText(getString(R.string.hold_exit_canceled));
            this.slowClosingToast.setDuration(0);
            this.slowClosingToast.show();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && closeSearchView()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (onBackPressed.invoke(this, false).booleanValue()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        SleepTimerConfig invoke = onMainUIRequestSleepTimerConfig.invoke(null);
        if (invoke == null) {
            invoke = new SleepTimerConfig();
        }
        lambda$updateSleepTimerIndicatorTh$6$MainActivity(invoke.enabled, true);
        updateLockOrientIndicator(onRequestLockOrientState.invoke(false).booleanValue(), true);
        MenuItem findItem = menu.findItem(R.id.action_bar_search);
        this.searchMenuItem = findItem;
        final SearchView searchView = (SearchView) findItem.getActionView();
        if (searchView != null) {
            searchView.setIconifiedByDefault(true);
            searchView.setSubmitButtonEnabled(false);
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.daaw.avee.MainActivity.7
                @Override // android.widget.SearchView.OnQueryTextListener
                public boolean onQueryTextSubmit(String str) {
                    searchView.clearFocus();
                    if (searchView.getTag() != null) {
                        MainActivity.onUISearchQueryTextChange.invoke(Integer.valueOf(((Integer) searchView.getTag()).intValue()), str);
                        return true;
                    }
                    return true;
                }

                @Override // android.widget.SearchView.OnQueryTextListener
                public boolean onQueryTextChange(String str) {
                    if (searchView.getTag() != null) {
                        MainActivity.onUISearchQueryTextChange.invoke(Integer.valueOf(((Integer) searchView.getTag()).intValue()), str);
                        return true;
                    }
                    return true;
                }
            });
            searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.daaw.avee.MainActivity.8
                @Override // android.widget.SearchView.OnCloseListener
                public boolean onClose() {
                    MainActivity.onUISearchQueryStateChange.invoke(false);
                    return false;
                }
            });
            searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.daaw.avee.MainActivity.9
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                }
            });
            setSearchViewStyle(searchView);
            updateSearchView(true);
        }
        updatePremiumMenu();
        this.vizBtn0MenuItem = menu.findItem(R.id.action_bar_viz_btn0);
        this.vizBtn1MenuItem = menu.findItem(R.id.action_bar_viz_btn1);
        this.vizBtn2MenuItem = menu.findItem(R.id.action_bar_viz_btn5);
        updateVizButtonVisibility(this.currentFragmentPage == 2);
        return super.onCreateOptionsMenu(menu);
    }

    public void updatePremiumMenu() {
        MenuItem menuItem = this.premiumMenuWeak.get();
        if (menuItem == null) {
            return;
        }
        Tuple2<Boolean, Boolean> invoke = onRequestIsPremiumIsPremiumAvailable.invoke(new Tuple2<>(false, false));
        if (invoke.obj2.booleanValue()) {
            if (invoke.obj1.booleanValue()) {
                menuItem.setIcon(R.drawable.ic_info2);
            } else {
                menuItem.setIcon(R.drawable.ic_coin);
            }
            menuItem.setVisible(true);
            return;
        }
        menuItem.setVisible(false);
    }

    boolean onMenuItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_equalizer /* 2131296581 */:
                onMainUIAction.invoke(3, new ContextData(this));
                return true;
            case R.id.menu_lib /* 2131296582 */:
                this.viewPager.setCurrentItem(0);
                return true;
            case R.id.menu_lock_orient /* 2131296583 */:
                this.switchLockOrient.toggle();
                return false;
            case R.id.menu_premium /* 2131296584 */:
                onMainUIAction.invoke(4, new ContextData(this));
                return true;
            case R.id.menu_queue /* 2131296585 */:
                this.viewPager.setCurrentItem(1);
                return true;
            case R.id.menu_settings /* 2131296586 */:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.menu_sleep_timer /* 2131296587 */:
                this.switchSleepTimer.toggle();
                return false;
            case R.id.menu_top /* 2131296588 */:
            default:
                return false;
            case R.id.menu_visual /* 2131296589 */:
                this.viewPager.setCurrentItem(2);
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            this.drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        switch (itemId) {
            case R.id.action_bar_viz_btn0 /* 2131296310 */:
                if (onToolbarAction.invoke(new ContextData(this), 1, false).booleanValue()) {
                    return true;
                }
                if (onToolbarAction.invoke(new ContextData(this), 2, false).booleanValue()) {
                    return true;
                }
                if (onToolbarAction.invoke(new ContextData(this), 3, false).booleanValue()) {
                    return true;
                }
                if (onMenuItemSelected(menuItem)) {
                    return super.onOptionsItemSelected(menuItem);
                }
                return true;
            case R.id.action_bar_viz_btn1 /* 2131296311 */:
                if (onToolbarAction.invoke(new ContextData(this), 2, false).booleanValue()) {
                }
                if (onToolbarAction.invoke(new ContextData(this), 3, false).booleanValue()) {
                }
                if (onMenuItemSelected(menuItem)) {
                }
                break;
            case R.id.action_bar_viz_btn5 /* 2131296312 */:
                if (onToolbarAction.invoke(new ContextData(this), 3, false).booleanValue()) {
                }
                if (onMenuItemSelected(menuItem)) {
                }
                break;
            default:
                if (onMenuItemSelected(menuItem)) {
                }
                break;
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        resetVideoMaximizeTimeout(true);
        super.onUserInteraction();
    }

    public void updateSearchView(boolean z) {
        updateSearchView(onRequestCurrentSearchEntry.invoke(null), z);
    }

    public void updateSearchView(ISearchEntry iSearchEntry, boolean z) {
        SearchView searchView;
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem == null || (searchView = (SearchView) menuItem.getActionView()) == null) {
            return;
        }
        if (iSearchEntry != null && iSearchEntry.isEnabled()) {
            String query = iSearchEntry.getQuery();
            this.searchMenuItem.setVisible(true);
            if (query != null && !query.isEmpty()) {
                searchView.setTag(Integer.valueOf(iSearchEntry.getIndex()));
                searchView.setQuery(query, false);
                if (searchView.isIconified()) {
                    searchView.setIconified(false);
                }
            } else {
                searchView.setTag(Integer.valueOf(iSearchEntry.getIndex()));
                searchView.setQuery("", false);
            }
            searchView.setQueryHint(iSearchEntry.getHint());
            return;
        }
        this.searchMenuItem.setVisible(false);
        searchView.setQueryHint("");
    }

    private void setSearchViewStyle(SearchView searchView) {
        UtilsUI.setViewStyle(searchView, ContextCompat.getColor(this, R.color.white_alpha_1), ContextCompat.getColor(this, R.color.text_color_m2));
    }

    private boolean closeSearchView() {
        SearchView searchView;
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem == null || (searchView = (SearchView) menuItem.getActionView()) == null || searchView.isIconified()) {
            return false;
        }
        searchView.setTag(Integer.valueOf(this.currentFragmentPage));
        searchView.setQuery("", false);
        searchView.setIconified(true);
        return true;
    }

    public void onViewPagerPageSelected(int i) {
        this.currentFragmentPage = i;
        showControls(onRequestShouldShowControls.invoke(true).booleanValue(), this.currentFragmentPage);
        onViewPagerPageSelected.invoke(Integer.valueOf(this.currentFragmentPage), this);
        onSetCurrentSearchIndex.invoke(Integer.valueOf(this.currentFragmentPage));
    }

    private Fragment findFragmentByPosition(int i) {
        SectionsPagerAdapter sectionsPagerAdapter;
        CustomViewPager customViewPager = this.viewPager;
        if (customViewPager == null || (sectionsPagerAdapter = this.sectionsPagerAdapter) == null) {
            return null;
        }
        FragmentManager fragmentManager = getFragmentManager();
        return fragmentManager.findFragmentByTag("android:switcher:" + customViewPager.getId() + ":" + sectionsPagerAdapter.getItemId(i));
    }

    public void doExit() {
        onExit.invoke();
        finish();
    }

    public void doExitFromService() {
        finish();
    }

    public void setKeepScreenOnLock(boolean z, boolean z2) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = z2 ? 1.0f : 0.0f;
        window.setAttributes(attributes);
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    public void toggleShowControls(int i) {
        ActionBar supportActionBar = getSupportActionBar();
        showControls((supportActionBar == null || supportActionBar.isShowing()) ? false : true, i);
    }

    public void showControls(boolean z, int i) {
        showControls(z, i, false);
    }

    private void updateVizButtonVisibility(boolean z) {
        if (z) {
            MenuItem menuItem = this.vizBtn0MenuItem;
            if (menuItem == null || menuItem.isVisible()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                int integer = getResources().getInteger(17694720);
                this.vizBtn0MenuItem.setVisible(true);
                this.vizBtn1MenuItem.setVisible(true);
                this.vizBtn2MenuItem.setVisible(true);
                this.vizMenuButtonAnimator = UtilsUI.animShowCustom255(this.vizMenuButtonAnimator, new Action1() { // from class: com.daaw.avee.-$$Lambda$MainActivity$hbXXvgvLAuFEVG1Ve8IPNP6TJXk
                    @Override // com.daaw.avee.Common.Action1
                    public final void onInvoke(Object obj) {
                        MainActivity.this.lambda$updateVizButtonVisibility$3$MainActivity((Integer) obj);
                    }
                }, this.vizBtn0MenuItem.getIcon().getAlpha(), integer);
                return;
            }
            this.vizBtn0MenuItem.setVisible(true);
            this.vizBtn1MenuItem.setVisible(true);
            this.vizBtn2MenuItem.setVisible(true);
            return;
        }
        MenuItem menuItem2 = this.vizBtn0MenuItem;
        if (menuItem2 == null || !menuItem2.isVisible()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.vizMenuButtonAnimator = UtilsUI.animHideCustom255(this.vizMenuButtonAnimator, new Action1() { // from class: com.daaw.avee.-$$Lambda$MainActivity$i_DABTj1lyFM03D9yEWI3RZHKqA
                @Override // com.daaw.avee.Common.Action1
                public final void onInvoke(Object obj) {
                    MainActivity.this.lambda$updateVizButtonVisibility$4$MainActivity((Integer) obj);
                }
            }, this.vizBtn0MenuItem.getIcon().getAlpha(), getResources().getInteger(17694720), new Action() { // from class: com.daaw.avee.-$$Lambda$MainActivity$DJR_I-3mdGPxVyBIJS5TddvTK3g
                @Override // com.daaw.avee.Common.Action
                public final void onInvoke() {
                    MainActivity.this.lambda$updateVizButtonVisibility$5$MainActivity();
                }
            });
            return;
        }
        this.vizBtn0MenuItem.setVisible(false);
        this.vizBtn1MenuItem.setVisible(false);
        this.vizBtn2MenuItem.setVisible(false);
    }

    public /* synthetic */ void lambda$updateVizButtonVisibility$3$MainActivity(Integer num) {
        this.vizBtn0MenuItem.getIcon().setAlpha(num.intValue());
        this.vizBtn1MenuItem.getIcon().setAlpha(num.intValue());
        this.vizBtn2MenuItem.getIcon().setAlpha(num.intValue());
    }

    public /* synthetic */ void lambda$updateVizButtonVisibility$4$MainActivity(Integer num) {
        this.vizBtn0MenuItem.getIcon().setAlpha(num.intValue());
        this.vizBtn1MenuItem.getIcon().setAlpha(num.intValue());
        this.vizBtn2MenuItem.getIcon().setAlpha(num.intValue());
    }

    public /* synthetic */ void lambda$updateVizButtonVisibility$5$MainActivity() {
        this.vizBtn0MenuItem.setVisible(false);
        this.vizBtn1MenuItem.setVisible(false);
        this.vizBtn2MenuItem.setVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showControls(boolean z, int i, boolean z2) {
        SystemUiHiderHoneycomb systemUiHiderHoneycomb;
        SystemUiHiderHoneycomb systemUiHiderHoneycomb2;
        resetVideoMaximizeTimeout(z);
        ActionBar supportActionBar = getSupportActionBar();
        updateVizButtonVisibility(i == 2);
        if (z) {
            if (supportActionBar != null) {
                if (i == 2) {
                    supportActionBar.setDisplayShowTitleEnabled(false);
                    supportActionBar.setDisplayShowHomeEnabled(false);
                    UtilsUI.showControl(getToolBar());
                } else {
                    supportActionBar.setDisplayShowTitleEnabled(true);
                    supportActionBar.setDisplayShowHomeEnabled(true);
                    UtilsUI.showControl(getToolBar());
                }
            }
            updateActionBar(onRequestTrackInfo.invoke(PlaylistSong.emptyData));
            if (!z2 && (systemUiHiderHoneycomb2 = this.systemUiHider) != null) {
                systemUiHiderHoneycomb2.show();
            }
        } else {
            if (supportActionBar != null) {
                UtilsUI.hideControl(getToolBar());
            }
            if (!z2 && (systemUiHiderHoneycomb = this.systemUiHider) != null) {
                systemUiHiderHoneycomb.hide();
            }
        }
        onFullscreenChanged.invoke(Boolean.valueOf(!z));
    }

    public void updateActionBar(PlaylistSong.Data data) {
        if (data.equals(this.assignedSongData)) {
            return;
        }
        this.assignedSongData = data;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(data.trackName);
            if (data.isArtistKnownOrSecondName()) {
                supportActionBar.setSubtitle(data.artistName);
            } else {
                supportActionBar.setSubtitle("");
            }
        }
        onRequestAlbumArtLarge.invoke(new AlbumArtRequest(data.dataSource, data.getAlbumArtPath0Str(), data.getAlbumArtPath1Str(), data.getAlbumArtGenerateStr()), new ImageLoadedListener() { // from class: com.daaw.avee.MainActivity.10
            Object object1;

            @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
            public void onBitmapLoaded(ImageResult imageResult, String str, String str2, String str3) {
                UtilsUI.copyBitmapSafe(ImageResult.getNonPersistentBitmapSafe(imageResult));
                ImageResult.closeSafe(imageResult);
            }

            @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
            public void setUserObject1(Object obj) {
                this.object1 = obj;
            }
        }, Integer.valueOf((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION), Integer.valueOf((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION));
    }

    public void updateSleepTimerIndicatorTh(final boolean z, final boolean z2) {
        this.handler.post(new Runnable() { // from class: com.daaw.avee.-$$Lambda$MainActivity$OwTimvHZ3VGSZamUAxx7nLxJ3d0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$updateSleepTimerIndicatorTh$6$MainActivity(z, z2);
            }
        });
    }

    /* renamed from: updateSleepTimerIndicator */
    public void lambda$updateSleepTimerIndicatorTh$6$MainActivity(boolean z, boolean z2) {
        MenuItem menuItem = this.sleepTimerIndicatorMenuItem;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        SwitchCompat switchCompat = this.switchSleepTimer;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }

    public void updateLockOrientIndicator(boolean z, boolean z2) {
        MenuItem menuItem = this.lockOrientIndicatorMenuItem;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        SwitchCompat switchCompat = this.switchLockOrient;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }

    public void resetVideoMaximizeTimeout(boolean z) {
        if (AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_pref_visControlsTimeout)) {
            this.handler.removeMessages(2);
            if (z) {
                int integer = getResources().getInteger(R.integer.video_maximize_timeout);
                this.handler.sendMessageDelayed(this.handler.obtainMessage(2), integer);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        onRequestPermissionsResult.invoke(this, Integer.valueOf(i));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (onActivityResult0.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent, false).booleanValue() || i2 != -1) {
            return;
        }
        onActivityResult.invoke(Integer.valueOf(i2), intent);
    }

    /* loaded from: classes.dex */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 3;
        }

        public SectionsPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.legacy.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return Fragment2.newInstance();
                }
                return Fragment1.newInstance();
            }
            return Fragment0.newInstance();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            Drawable drawable;
            SpannableStringBuilder spannableStringBuilder;
            if (i == 0) {
                drawable = ContextCompat.getDrawable(MainActivity.this, R.drawable.ic_library_2_s);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else if (i == 1) {
                drawable = ContextCompat.getDrawable(MainActivity.this, R.drawable.ic_playlist4);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else if (i != 2) {
                return " ";
            } else {
                drawable = ContextCompat.getDrawable(MainActivity.this, R.drawable.ic_visual2);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            }
            if (drawable == null) {
                return "";
            }
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), 1, 2, 33);
            return spannableStringBuilder;
        }
    }
}
