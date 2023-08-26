.class final Lchristophedelory/rss/RFC822;
.super Ljava/lang/Object;
.source "RFC822.java"


# static fields
.field private static final COMPACT_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

.field private static final COMPACT_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

.field private static final FULL_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

.field private static final FULL_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

.field public static final ISO8601_DATETIME_FORMAT:Ljava/text/DateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 20
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "EEE, d MMM yyyy HH:mm:ss Z"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    .line 25
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "EEE, d MMM yyyy HH:mm Z"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

    .line 30
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "d MMM yyyy HH:mm:ss Z"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lchristophedelory/rss/RFC822;->COMPACT_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    .line 35
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "d MMM yyyy HH:mm Z"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lchristophedelory/rss/RFC822;->COMPACT_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

    .line 42
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lchristophedelory/rss/RFC822;->ISO8601_DATETIME_FORMAT:Ljava/text/DateFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static toString(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    .line 52
    sget-object v0, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 54
    :try_start_0
    sget-object v1, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    invoke-virtual {v1, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 55
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Ljava/util/Date;
    .locals 3

    .line 68
    sget-object v0, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    const/4 v1, 0x0

    .line 72
    :try_start_0
    sget-object v2, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    invoke-virtual {v2, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_a

    :catch_0
    move-object v2, v1

    .line 79
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    .line 83
    sget-object v0, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

    monitor-enter v0

    .line 87
    :try_start_2
    sget-object v2, Lchristophedelory/rss/RFC822;->FULL_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

    invoke-virtual {v2, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_1
    move-object v2, v1

    .line 94
    :goto_1
    :try_start_3
    monitor-exit v0

    goto :goto_3

    :goto_2
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0

    :cond_0
    :goto_3
    if-nez v2, :cond_1

    .line 99
    sget-object v0, Lchristophedelory/rss/RFC822;->COMPACT_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    monitor-enter v0

    .line 103
    :try_start_4
    sget-object v2, Lchristophedelory/rss/RFC822;->COMPACT_RFC822_DATETIME_FORMAT:Ljava/text/DateFormat;

    invoke-virtual {v2, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2
    :try_end_4
    .catch Ljava/text/ParseException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p0

    goto :goto_5

    :catch_2
    move-object v2, v1

    .line 110
    :goto_4
    :try_start_5
    monitor-exit v0

    goto :goto_6

    :goto_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p0

    :cond_1
    :goto_6
    if-nez v2, :cond_2

    .line 115
    sget-object v0, Lchristophedelory/rss/RFC822;->COMPACT_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

    monitor-enter v0

    .line 119
    :try_start_6
    sget-object v2, Lchristophedelory/rss/RFC822;->COMPACT_RFC822_DATETIME_FORMAT_2:Ljava/text/DateFormat;

    invoke-virtual {v2, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_6
    .catch Ljava/text/ParseException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception p0

    goto :goto_8

    .line 126
    :catch_3
    :goto_7
    :try_start_7
    monitor-exit v0

    move-object v2, v1

    goto :goto_9

    :goto_8
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p0

    :cond_2
    :goto_9
    return-object v2

    .line 79
    :goto_a
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw p0
.end method
