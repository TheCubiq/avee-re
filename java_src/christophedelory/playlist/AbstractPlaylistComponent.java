package christophedelory.playlist;
/* loaded from: classes.dex */
public abstract class AbstractPlaylistComponent {
    private int _repeatCount = 1;
    private transient AbstractTimeContainer _parent = null;

    public abstract void acceptDown(PlaylistVisitor playlistVisitor) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setParent(AbstractTimeContainer abstractTimeContainer) {
        this._parent = abstractTimeContainer;
    }

    public AbstractTimeContainer getParent() {
        return this._parent;
    }

    public int getRepeatCount() {
        return this._repeatCount;
    }

    public void setRepeatCount(int i) {
        if (i < 0) {
            this._repeatCount = -1;
        } else {
            this._repeatCount = i;
        }
    }

    public void acceptUp(PlaylistVisitor playlistVisitor) throws Exception {
        AbstractTimeContainer abstractTimeContainer = this._parent;
        if (abstractTimeContainer != null) {
            abstractTimeContainer.acceptUp(playlistVisitor);
        }
    }
}
