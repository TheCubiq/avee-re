.class public final Lcom/daaw/wn5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lorg/json/JSONObject;

.field public final b:Lcom/daaw/pu3;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Lcom/daaw/pu3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wn5;->a:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/daaw/wn5;->b:Lcom/daaw/pu3;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/wn5;)Lcom/daaw/pu3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wn5;->b:Lcom/daaw/pu3;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/wn5;)Lorg/json/JSONObject;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wn5;->a:Lorg/json/JSONObject;

    return-object p0
.end method
