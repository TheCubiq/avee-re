package christophedelory.playlist;
/* loaded from: classes.dex */
public class Sequence extends AbstractTimeContainer {
    @Override // christophedelory.playlist.AbstractTimeContainer, christophedelory.playlist.AbstractPlaylistComponent
    public void acceptDown(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitSequence(this);
        super.acceptDown(playlistVisitor);
        playlistVisitor.endVisitSequence(this);
    }

    @Override // christophedelory.playlist.AbstractPlaylistComponent
    public void acceptUp(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitSequence(this);
        super.acceptUp(playlistVisitor);
        playlistVisitor.endVisitSequence(this);
    }
}
