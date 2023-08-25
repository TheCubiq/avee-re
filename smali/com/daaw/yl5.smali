.class public final synthetic Lcom/daaw/yl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lorg/json/JSONObject;

.field public final synthetic b:Lcom/daaw/pu3;


# direct methods
.method public synthetic constructor <init>(Lorg/json/JSONObject;Lcom/daaw/pu3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yl5;->a:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/daaw/yl5;->b:Lcom/daaw/pu3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/yl5;->a:Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/daaw/yl5;->b:Lcom/daaw/pu3;

    check-cast p1, Ljava/io/InputStream;

    new-instance v2, Lcom/daaw/bn5;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v3}, Lcom/daaw/pn5;->a(Ljava/io/Reader;)Lcom/daaw/pn5;

    move-result-object p1

    invoke-direct {v2, p1, v0, v1}, Lcom/daaw/bn5;-><init>(Lcom/daaw/pn5;Lorg/json/JSONObject;Lcom/daaw/pu3;)V

    return-object v2
.end method
