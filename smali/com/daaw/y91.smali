.class public Lcom/daaw/y91;
.super Lcom/daaw/kt;
.source ""


# static fields
.field public static b:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    sput-object v0, Lcom/daaw/y91;->b:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/kt;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/y91;->f()V

    sget-object v0, Lcom/daaw/nc0;->j:Lcom/daaw/xw1;

    new-instance v1, Lcom/daaw/w91;

    invoke-direct {v1, p0}, Lcom/daaw/w91;-><init>(Lcom/daaw/y91;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/y91;[Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/y91;->h([Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/y91;Ljava/lang/Object;[Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/y91;->i(Ljava/lang/Object;[Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 11

    const-string v0, "87ec1545ce"

    const-string v1, "3f4af8b5d"

    const-string v2, "e27229c66e072"

    const-string v3, "4e"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "e0418bb"

    const-string v2, "ec1545"

    const-string v3, "a9a844"

    const-string v4, "ba"

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "3bc9"

    const-string v3, "52fc"

    const-string v4, "229c66"

    const-string v5, "95"

    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "388"

    const-string v4, "303f0"

    const-string v5, "83"

    filled-new-array {v3, v4, v4, v5}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "f52"

    const-string v5, "93a"

    const-string v6, "072e7357aea"

    const-string v7, "29"

    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "0b"

    const-string v6, "bc7"

    const-string v7, "c66e072e7357ae83f4a"

    const-string v8, "ae83ae83"

    const-string v9, "bb"

    filled-new-array {v5, v6, v7, v8, v9}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aget-object v7, v0, v6

    const/4 v8, 0x1

    aget-object v0, v0, v8

    const/4 v9, 0x5

    new-array v9, v9, [[Ljava/lang/String;

    aput-object v1, v9, v6

    aput-object v2, v9, v8

    const/4 v1, 0x2

    aput-object v3, v9, v1

    const/4 v1, 0x3

    aput-object v4, v9, v1

    const/4 v1, 0x4

    aput-object v5, v9, v1

    invoke-static {v7, v0, v9}, Lcom/daaw/z9;->d(Ljava/lang/String;Ljava/lang/String;[[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/z9;->e(Ljava/util/List;)Ljava/util/List;

    invoke-static {v0}, Lcom/daaw/z9;->f(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x40

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v4, p0, v2

    const-string v5, "SHA"

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    invoke-virtual {v4}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v7, 0x0

    :goto_1
    array-length v9, v4

    if-ge v7, v9, :cond_1

    aget-byte v9, v4, v7

    and-int/lit16 v9, v9, 0xff

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    if-ne v10, v8, :cond_0

    const-string v10, "0"

    invoke-virtual {v5, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    invoke-virtual {v5, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_2

    add-int/lit8 v3, v3, 0x22

    return v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    :cond_3
    return v6
.end method

.method public static d()V
    .locals 2

    new-instance v0, Lcom/daaw/y91$a;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/daaw/y91$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(Ljava/lang/Runnable;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    invoke-static {}, Lcom/daaw/y91;->d()V

    :goto_0
    return-void
.end method

.method private synthetic h([Ljava/lang/Integer;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/y91;->g()Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    const/4 v0, 0x6

    aget-object v0, p1, v0

    goto :goto_0

    :cond_0
    aget-object v0, p1, v1

    :goto_0
    const/4 v2, 0x3

    aput-object v0, p1, v2

    invoke-virtual {p0}, Lcom/daaw/y91;->g()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x5

    aget-object v0, p1, v0

    goto :goto_1

    :cond_1
    aget-object v0, p1, v2

    :goto_1
    aput-object v0, p1, v1

    return-void
.end method

.method private synthetic i(Ljava/lang/Object;[Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 2

    const/4 p1, 0x1

    aget-object v0, p2, p1

    aget-object v1, p2, p1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, p1

    new-instance v1, Lcom/daaw/x91;

    invoke-direct {v1, p0, p2}, Lcom/daaw/x91;-><init>(Lcom/daaw/y91;[Ljava/lang/Integer;)V

    invoke-static {v1}, Lcom/daaw/y91;->e(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/daaw/y91;->g()Z

    move-result p2

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public f()V
    .locals 3

    sget-object v0, Lcom/daaw/y91;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/y91;->c(Landroid/content/Context;)I

    move-result v0

    sget-object v2, Lcom/daaw/y91;->b:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/dx0;->h()Lcom/daaw/dx0;

    move-result-object v0

    :goto_0
    aput-object v0, v2, v1

    sget-object v0, Lcom/daaw/y91;->b:[Ljava/lang/Object;

    const/4 v1, 0x1

    aput-object p0, v0, v1

    :cond_1
    return-void
.end method

.method public final g()Z
    .locals 4

    sget-object v0, Lcom/daaw/y91;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    aget-object v3, v0, v2

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/daaw/y91;->b:[Ljava/lang/Object;

    aget-object v0, v0, v2

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method
