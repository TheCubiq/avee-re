.class public final synthetic Lcom/daaw/vt5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/zt5;

.field public final synthetic b:Lcom/daaw/u85;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/zt5;Lcom/daaw/u85;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vt5;->a:Lcom/daaw/zt5;

    iput-object p2, p0, Lcom/daaw/vt5;->b:Lcom/daaw/u85;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/vt5;->a:Lcom/daaw/zt5;

    iget-object v1, p0, Lcom/daaw/vt5;->b:Lcom/daaw/u85;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/zt5;->d(Lcom/daaw/u85;Lorg/json/JSONObject;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
