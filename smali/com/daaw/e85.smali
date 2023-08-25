.class public final synthetic Lcom/daaw/e85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/u85;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/u85;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e85;->a:Lcom/daaw/u85;

    iput-object p2, p0, Lcom/daaw/e85;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/e85;->c:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/e85;->a:Lcom/daaw/u85;

    iget-object v1, p0, Lcom/daaw/e85;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/e85;->c:Lorg/json/JSONObject;

    check-cast p1, Lcom/daaw/a74;

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/u85;->c(Ljava/lang/String;Lorg/json/JSONObject;Lcom/daaw/a74;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
