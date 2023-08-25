.class public final Lcom/daaw/xn5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# static fields
.field public static final d:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/io6;

.field public final c:Lcom/daaw/to6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "([^;]+=[^;]+)(;\\s|$)"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/daaw/xn5;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/to6;Lcom/daaw/io6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xn5;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/xn5;->c:Lcom/daaw/to6;

    iput-object p3, p0, Lcom/daaw/xn5;->b:Lcom/daaw/io6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Lcom/daaw/wn5;

    invoke-static {p1}, Lcom/daaw/wn5;->b(Lcom/daaw/wn5;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "http_timeout_millis"

    const v2, 0xea60

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pu3;->a()I

    move-result v1

    const-string v2, ""

    const/4 v3, 0x1

    const/4 v4, -0x2

    if-ne v1, v4, :cond_9

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pu3;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/daaw/xn5;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/daaw/g93;->I0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "Cookie"

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/daaw/xn5;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v4, v2

    goto :goto_1

    :cond_0
    sget-object v4, Lcom/daaw/xn5;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    move-object v4, v2

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "id="

    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "ide="

    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, "; "

    invoke-virtual {v4, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_3
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_4
    :goto_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {v6, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/daaw/xn5;->a:Ljava/lang/String;

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_2
    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pu3;->i()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lcom/daaw/wn5;->b(Lcom/daaw/wn5;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/daaw/yn5;->a(Ljava/util/Map;Lorg/json/JSONObject;)V

    :cond_7
    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pu3;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pu3;->d()Ljava/lang/String;

    move-result-object v2

    :cond_8
    iget-object v0, p0, Lcom/daaw/xn5;->c:Lcom/daaw/to6;

    iget-object v1, p0, Lcom/daaw/xn5;->b:Lcom/daaw/io6;

    invoke-interface {v1, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v0, v1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    new-instance v0, Lcom/daaw/on5;

    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/pu3;->e()Ljava/lang/String;

    move-result-object v4

    sget-object v1, Lcom/daaw/cy6;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    invoke-static {p1}, Lcom/daaw/wn5;->a(Lcom/daaw/wn5;)Lcom/daaw/pu3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/pu3;->i()Z

    move-result v9

    const-string v8, ""

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/daaw/on5;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    return-object v0

    :cond_9
    invoke-virtual {v0}, Lcom/daaw/pu3;->a()I

    move-result p1

    if-ne p1, v3, :cond_b

    invoke-virtual {v0}, Lcom/daaw/pu3;->f()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {v0}, Lcom/daaw/pu3;->f()Ljava/util/List;

    move-result-object p1

    const-string v0, ", "

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    :cond_a
    new-instance p1, Lcom/daaw/gi5;

    const/4 v0, 0x2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Error building request URL: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/daaw/gi5;-><init>(ILjava/lang/String;)V

    goto :goto_3

    :cond_b
    new-instance p1, Lcom/daaw/gi5;

    invoke-direct {p1, v3}, Lcom/daaw/gi5;-><init>(I)V

    :goto_3
    iget-object v0, p0, Lcom/daaw/xn5;->c:Lcom/daaw/to6;

    iget-object v1, p0, Lcom/daaw/xn5;->b:Lcom/daaw/io6;

    invoke-interface {v1, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v0, v1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method
