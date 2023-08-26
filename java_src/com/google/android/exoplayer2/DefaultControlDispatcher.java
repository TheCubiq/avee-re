package com.google.android.exoplayer2;
/* loaded from: classes.dex */
public class DefaultControlDispatcher implements ControlDispatcher {
    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlayWhenReady(Player player, boolean z) {
        player.setPlayWhenReady(z);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSeekTo(Player player, int i, long j) {
        player.seekTo(i, j);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetRepeatMode(Player player, int i) {
        player.setRepeatMode(i);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetShuffleModeEnabled(Player player, boolean z) {
        player.setShuffleModeEnabled(z);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchStop(Player player, boolean z) {
        player.stop(z);
        return true;
    }
}
