package christophedelory.player;
/* loaded from: classes.dex */
public class PlayerSupport implements Cloneable {
    private final String _comment;
    private final boolean _isSaved;
    private final Player _player;

    /* loaded from: classes.dex */
    public enum Player {
        FOOBAR2000,
        ITUNES,
        MEDIA_PLAYER_CLASSIC,
        MPLAYER,
        QUICKTIME,
        REALPLAYER,
        VLC_MEDIA_PLAYER,
        WINAMP,
        WINDOWS_MEDIA_PLAYER
    }

    /* renamed from: christophedelory.player.PlayerSupport$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$christophedelory$player$PlayerSupport$Player;

        static {
            int[] iArr = new int[Player.values().length];
            $SwitchMap$christophedelory$player$PlayerSupport$Player = iArr;
            try {
                iArr[Player.FOOBAR2000.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.ITUNES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.MEDIA_PLAYER_CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.MPLAYER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.QUICKTIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.REALPLAYER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.VLC_MEDIA_PLAYER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.WINAMP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$christophedelory$player$PlayerSupport$Player[Player.WINDOWS_MEDIA_PLAYER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static String toString(Player player) {
        switch (AnonymousClass1.$SwitchMap$christophedelory$player$PlayerSupport$Player[player.ordinal()]) {
            case 1:
                return "Foobar2000";
            case 2:
                return "iTunes";
            case 3:
                return "Media Player Classic";
            case 4:
                return "MPlayer";
            case 5:
                return "QuickTime";
            case 6:
                return "RealPlayer";
            case 7:
                return "VLC Media Player (VideoLAN)";
            case 8:
                return "Winamp";
            case 9:
                return "Windows Media Player";
            default:
                return null;
        }
    }

    public PlayerSupport(Player player, boolean z, String str) {
        if (player == null) {
            throw new NullPointerException("no player");
        }
        this._player = player;
        this._isSaved = z;
        this._comment = str;
    }

    public Player getPlayer() {
        return this._player;
    }

    public boolean isSaved() {
        return this._isSaved;
    }

    public String getComment() {
        return this._comment;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
