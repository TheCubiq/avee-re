.class public Lcom/daaw/xb1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/mn;


# direct methods
.method public constructor <init>(Lcom/daaw/mn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xb1;->a:Lcom/daaw/mn;

    return-void
.end method

.method public static a(I)Lcom/daaw/yb1;
    .locals 3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not determine SettingsJsonTransform for settings version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ". Using default settings values."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/ml0;->d(Ljava/lang/String;)V

    new-instance p0, Lcom/daaw/wr;

    invoke-direct {p0}, Lcom/daaw/wr;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Lcom/daaw/cc1;

    invoke-direct {p0}, Lcom/daaw/cc1;-><init>()V

    return-object p0
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)Lcom/daaw/tb1;
    .locals 2

    const-string v0, "settings_version"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/daaw/xb1;->a(I)Lcom/daaw/yb1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xb1;->a:Lcom/daaw/mn;

    invoke-interface {v0, v1, p1}, Lcom/daaw/yb1;->a(Lcom/daaw/mn;Lorg/json/JSONObject;)Lcom/daaw/tb1;

    move-result-object p1

    return-object p1
.end method
