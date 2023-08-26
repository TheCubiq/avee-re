package com.daaw.avee.comp.SleepTimer;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.shawnlin.numberpicker.NumberPicker;
import java.util.Calendar;
import java.util.Date;
/* loaded from: classes.dex */
public class SleepTimerDialog extends DialogFragment {
    private ImageButton btnToggle;
    private int colorOn;
    private NumberPicker nrH;
    private NumberPicker nrM;
    private int secondsRemaining = 0;
    private Date sleepAtTime = new Date();
    private Runnable timerTask;
    private TextView txtStatus;
    public static WeakEvent4<Boolean, Integer, Date, Boolean> onSleepTimerUISubmit = new WeakEvent4<>();
    public static WeakEventR<SleepTimerConfig> onSleepTimerUIRequestSleepTimerConfig = new WeakEventR<>();
    public static WeakEventR<Integer> onSleepTimerUIRequestRemainingSeconds = new WeakEventR<>();
    public static WeakEventR<Tuple2<Date, Boolean>> onSleepTimerUIRequestSleepAtTime = new WeakEventR<>();

    public static SleepTimerDialog createAndShowSleepTimerDialog(ContextData contextData) {
        SleepTimerDialog sleepTimerDialog = new SleepTimerDialog();
        UtilsUI.showDialogSafe(sleepTimerDialog, "SleepTimerDialog", contextData);
        return sleepTimerDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_sleep_timer, null);
        builder.setView(inflate);
        builder.setTitle(R.string.dialog_sleep_timer_title);
        this.nrM = (NumberPicker) inflate.findViewById(R.id.numberPickerM);
        this.nrH = (NumberPicker) inflate.findViewById(R.id.numberPickerH);
        this.btnToggle = null;
        TextView textView = (TextView) inflate.findViewById(R.id.txtStatus);
        this.txtStatus = textView;
        this.colorOn = textView.getCurrentTextColor();
        this.sleepAtTime = onSleepTimerUIRequestSleepAtTime.invoke(new Tuple2<>(new Date(), false)).obj1;
        this.timerTask = new Runnable() { // from class: com.daaw.avee.comp.SleepTimer.SleepTimerDialog.1
            @Override // java.lang.Runnable
            public void run() {
                SleepTimerDialog.this.secondsRemaining = (int) ((SleepTimerDialog.this.sleepAtTime.getTime() - new Date().getTime()) / 1000);
                SleepTimerDialog.this.updateTxt();
                SleepTimerDialog.this.txtStatus.postDelayed(SleepTimerDialog.this.timerTask, 1000L);
            }
        };
        if (onSleepTimerUIRequestSleepTimerConfig.invoke(null) == null) {
            new SleepTimerConfig();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.sleepAtTime);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        this.nrM.setMaxValue(59);
        this.nrM.setMinValue(0);
        this.nrM.setValue(i2);
        this.nrH.setMaxValue(23);
        this.nrH.setMinValue(0);
        this.nrH.setValue(i);
        this.nrH.setDividerColor(this.colorOn);
        this.nrM.setDividerColor(this.colorOn);
        this.nrH.setSelectedTextColor(this.colorOn);
        this.nrM.setSelectedTextColor(this.colorOn);
        this.nrH.setTextColor(this.colorOn);
        this.nrM.setTextColor(this.colorOn);
        this.nrM.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: com.daaw.avee.comp.SleepTimer.SleepTimerDialog.2
            @Override // com.shawnlin.numberpicker.NumberPicker.OnValueChangeListener
            public void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                SleepTimerDialog.this.configure(true, true);
            }
        });
        this.nrH.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: com.daaw.avee.comp.SleepTimer.SleepTimerDialog.3
            @Override // com.shawnlin.numberpicker.NumberPicker.OnValueChangeListener
            public void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                SleepTimerDialog.this.configure(true, true);
            }
        });
        builder.setPositiveButton(R.string.dialog_set_timer, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.SleepTimer.SleepTimerDialog.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                SleepTimerDialog.this.configure(true);
            }
        });
        builder.setNegativeButton(R.string.dialog_cancel_timer, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.SleepTimer.SleepTimerDialog.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                SleepTimerDialog.this.configure(false);
            }
        });
        this.txtStatus.postDelayed(this.timerTask, 0L);
        return builder.create();
    }

    int getMinutes() {
        return this.nrM.getValue() + (this.nrH.getValue() * 60);
    }

    void updateTxt() {
        TextView textView = this.txtStatus;
        textView.setText(((Object) this.txtStatus.getResources().getText(R.string.dialog_timer_remaining)) + " " + Utils.getDurationStringHHMMSS(this.secondsRemaining, false));
    }

    void configure(boolean z) {
        configure(z, false);
    }

    void configure(boolean z, boolean z2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, this.nrH.getValue());
        calendar2.set(12, this.nrM.getValue());
        calendar2.set(13, 0);
        if (calendar2.before(calendar)) {
            calendar2.add(11, 24);
        }
        this.sleepAtTime = new Date(calendar2.getTimeInMillis());
        if (z2) {
            return;
        }
        onSleepTimerUISubmit.invoke(Boolean.valueOf(z), Integer.valueOf(getMinutes()), this.sleepAtTime, false);
    }
}
