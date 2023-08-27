.class public Lchristophedelory/playlist/kpl/Info;
.super Ljava/lang/Object;
.source "Info.java"


# static fields
.field private static final DATE_FORMAT:Ljava/text/DateFormat;


# instance fields
.field private _author:Ljava/lang/String;

.field private _creation_day:Ljava/util/Date;

.field private _kpl_version:Ljava/lang/String;

.field private _modified_day:Ljava/util/Date;

.field private _player:Ljava/lang/String;

.field private _player_version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 49
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "yyyy-MM-dd"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_creation_day:Ljava/util/Date;

    .line 59
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_modified_day:Ljava/util/Date;

    .line 64
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_author:Ljava/lang/String;

    .line 69
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_player:Ljava/lang/String;

    .line 74
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_player_version:Ljava/lang/String;

    const-string v0, "1"

    .line 79
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_kpl_version:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAuthor()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_author:Ljava/lang/String;

    return-object v0
.end method

.method public getCreationDay()Ljava/util/Date;
    .locals 1

    .line 134
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_creation_day:Ljava/util/Date;

    return-object v0
.end method

.method public getCreationDayString()Ljava/lang/String;
    .locals 3

    .line 91
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_creation_day:Ljava/util/Date;

    if-eqz v0, :cond_0

    .line 93
    sget-object v0, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 95
    :try_start_0
    sget-object v1, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    iget-object v2, p0, Lchristophedelory/playlist/kpl/Info;->_creation_day:Ljava/util/Date;

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 96
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public getKplVersion()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_kpl_version:Ljava/lang/String;

    return-object v0
.end method

.method public getModifiedDay()Ljava/util/Date;
    .locals 1

    .line 201
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_modified_day:Ljava/util/Date;

    return-object v0
.end method

.method public getModifiedDayString()Ljava/lang/String;
    .locals 3

    .line 158
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_modified_day:Ljava/util/Date;

    if-eqz v0, :cond_0

    .line 160
    sget-object v0, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 162
    :try_start_0
    sget-object v1, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    iget-object v2, p0, Lchristophedelory/playlist/kpl/Info;->_modified_day:Ljava/util/Date;

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 163
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public getPlayer()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_player:Ljava/lang/String;

    return-object v0
.end method

.method public getPlayerVersion()Ljava/lang/String;
    .locals 1

    .line 262
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Info;->_player_version:Ljava/lang/String;

    return-object v0
.end method

.method public setAuthor(Ljava/lang/String;)V
    .locals 0

    .line 232
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_author:Ljava/lang/String;

    return-void
.end method

.method public setCreationDay(Ljava/util/Date;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_creation_day:Ljava/util/Date;

    return-void
.end method

.method public setCreationDayString(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 111
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 115
    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_creation_day:Ljava/util/Date;

    goto :goto_0

    .line 119
    :cond_0
    sget-object v0, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 121
    :try_start_0
    sget-object v1, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_creation_day:Ljava/util/Date;

    .line 122
    monitor-exit v0

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setKplVersion(Ljava/lang/String;)V
    .locals 0

    .line 292
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_kpl_version:Ljava/lang/String;

    return-void
.end method

.method public setModifiedDay(Ljava/util/Date;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_modified_day:Ljava/util/Date;

    return-void
.end method

.method public setModifiedDayString(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 178
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 182
    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_modified_day:Ljava/util/Date;

    goto :goto_0

    .line 186
    :cond_0
    sget-object v0, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 188
    :try_start_0
    sget-object v1, Lchristophedelory/playlist/kpl/Info;->DATE_FORMAT:Ljava/text/DateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_modified_day:Ljava/util/Date;

    .line 189
    monitor-exit v0

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setPlayer(Ljava/lang/String;)V
    .locals 0

    .line 252
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_player:Ljava/lang/String;

    return-void
.end method

.method public setPlayerVersion(Ljava/lang/String;)V
    .locals 0

    .line 272
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Info;->_player_version:Ljava/lang/String;

    return-void
.end method
