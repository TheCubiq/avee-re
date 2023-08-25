.class public final Lcom/daaw/h25;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lorg/json/JSONObject;

.field public final b:Lcom/daaw/u85;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Lcom/daaw/u85;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h25;->a:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/daaw/h25;->b:Lcom/daaw/u85;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/u85;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h25;->b:Lcom/daaw/u85;

    return-object v0
.end method

.method public final b()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h25;->a:Lorg/json/JSONObject;

    return-object v0
.end method
