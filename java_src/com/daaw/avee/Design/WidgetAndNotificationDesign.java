package com.daaw.avee.Design;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.IAlbumArtCore;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.playback.view.MediaPlaybackNotification;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class WidgetAndNotificationDesign {
    static WidgetAndNotificationDesign instance = new WidgetAndNotificationDesign();
    private List<Object> listenerRefHolder = new ArrayList();

    public WidgetAndNotificationDesign() {
        MediaPlaybackNotification.onRequestAlbumArtLarge.subscribeWeak(new WeakEvent5.Handler<Context, AlbumArtRequest, ImageLoadedListener, Integer, Integer>() { // from class: com.daaw.avee.Design.WidgetAndNotificationDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(Context context, AlbumArtRequest albumArtRequest, ImageLoadedListener imageLoadedListener, Integer num, Integer num2) {
                IAlbumArtCore createInstance = AlbumArtFactory.createInstance(context);
                if (createInstance != null) {
                    createInstance.loadAlbumArtLarge(false, albumArtRequest.videoThumbDataSource, albumArtRequest.path0, albumArtRequest.path1, albumArtRequest.genStr, true, imageLoadedListener, num.intValue(), num2.intValue(), num.intValue(), num2.intValue(), 0, -1, true, null, null);
                }
            }
        }, this.listenerRefHolder);
    }

    public static WidgetAndNotificationDesign createInstance() {
        return instance;
    }
}
