.class public final synthetic Lcom/daaw/jn5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/f96;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jn5;->a:Lcom/daaw/f96;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jn5;->a:Lcom/daaw/f96;

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {v0}, Lcom/daaw/f96;->a()Lcom/daaw/l76;

    move-result-object p1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/l76;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
