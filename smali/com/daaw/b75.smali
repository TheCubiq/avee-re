.class public final synthetic Lcom/daaw/b75;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/k75;

.field public final synthetic b:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/k75;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b75;->a:Lcom/daaw/k75;

    iput-object p2, p0, Lcom/daaw/b75;->b:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/b75;->a:Lcom/daaw/k75;

    iget-object v1, p0, Lcom/daaw/b75;->b:Lorg/json/JSONObject;

    check-cast p1, Lcom/daaw/a74;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/k75;->c(Lorg/json/JSONObject;Lcom/daaw/a74;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
