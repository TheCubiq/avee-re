.class public Lcom/daaw/avee/Common/MediaStoreUtils;
.super Ljava/lang/Object;
.source "MediaStoreUtils.java"


# static fields
.field public static emptyCursor:Landroid/database/Cursor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/daaw/avee/Common/MediaStoreUtils$1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MediaStoreUtils$1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Common/MediaStoreUtils;->emptyCursor:Landroid/database/Cursor;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static CursorGetStringSafe(Landroid/database/Cursor;I)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 293
    :cond_0
    :try_start_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static closeCursor(Landroid/database/Cursor;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 323
    :cond_0
    invoke-interface {p0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 324
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    :cond_1
    return-void
.end method

.method public static getOrderBy(Lcom/daaw/avee/Design/SortDesign$SortDesc;)Ljava/lang/String;
    .locals 1

    .line 228
    iget v0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    invoke-static {p0, v0}, Lcom/daaw/avee/Common/MediaStoreUtils;->getOrderBy_(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getOrderBy(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/lang/String;
    .locals 2

    .line 232
    iget v0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    iget p1, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    :cond_0
    invoke-static {p0, p1}, Lcom/daaw/avee/Common/MediaStoreUtils;->getOrderBy_(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getOrderBy_(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 241
    :cond_0
    iget-boolean p0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortDescending:Z

    const-string v1, "date_added"

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    xor-int/lit8 p0, p0, 0x1

    const-string v0, "_size"

    goto :goto_0

    :pswitch_2
    xor-int/lit8 p0, p0, 0x1

    const-string v0, "duration"

    goto :goto_0

    :pswitch_3
    xor-int/lit8 p0, p0, 0x1

    move-object v0, v1

    goto :goto_0

    :pswitch_4
    const-string v0, "_data"

    goto :goto_0

    :pswitch_5
    const-string v0, "album"

    goto :goto_0

    :pswitch_6
    const-string v0, "artist"

    goto :goto_0

    :pswitch_7
    const-string v0, "title"

    :goto_0
    :pswitch_8
    if-eqz v0, :cond_1

    if-eqz p0, :cond_1

    .line 285
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " DESC"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_0
        :pswitch_8
    .end packed-switch
.end method

.method public static querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    .line 302
    :try_start_0
    invoke-virtual/range {p0 .. p5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 304
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static querySafeEmpty(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    .line 312
    :try_start_0
    invoke-virtual/range {p0 .. p5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-nez p0, :cond_0

    .line 313
    sget-object p0, Lcom/daaw/avee/Common/MediaStoreUtils;->emptyCursor:Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 316
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 317
    sget-object p0, Lcom/daaw/avee/Common/MediaStoreUtils;->emptyCursor:Landroid/database/Cursor;

    return-object p0
.end method
