.class public Lchristophedelory/plist/Date;
.super Lchristophedelory/plist/PlistObject;
.source "Date.java"


# static fields
.field private static final DATETIME_FORMAT:Ljava/text/DateFormat;


# instance fields
.field private _value:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 45
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lchristophedelory/plist/Date;->DATETIME_FORMAT:Ljava/text/DateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Lchristophedelory/plist/PlistObject;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lchristophedelory/plist/Date;->_value:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .locals 1

    .line 67
    invoke-direct {p0}, Lchristophedelory/plist/PlistObject;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lchristophedelory/plist/Date;->_value:Ljava/util/Date;

    if-eqz p1, :cond_0

    .line 74
    iput-object p1, p0, Lchristophedelory/plist/Date;->_value:Ljava/util/Date;

    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no date"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getValue()Ljava/util/Date;
    .locals 1

    .line 122
    iget-object v0, p0, Lchristophedelory/plist/Date;->_value:Ljava/util/Date;

    return-object v0
.end method

.method public getValueString()Ljava/lang/String;
    .locals 3

    .line 92
    sget-object v0, Lchristophedelory/plist/Date;->DATETIME_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 94
    :try_start_0
    sget-object v1, Lchristophedelory/plist/Date;->DATETIME_FORMAT:Ljava/text/DateFormat;

    iget-object v2, p0, Lchristophedelory/plist/Date;->_value:Ljava/util/Date;

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 95
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public setValue(Ljava/util/Date;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 139
    iput-object p1, p0, Lchristophedelory/plist/Date;->_value:Ljava/util/Date;

    return-void

    .line 136
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no date"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setValueString(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 108
    sget-object v0, Lchristophedelory/plist/Date;->DATETIME_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 110
    :try_start_0
    sget-object v1, Lchristophedelory/plist/Date;->DATETIME_FORMAT:Ljava/text/DateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/plist/Date;->_value:Ljava/util/Date;

    .line 111
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
