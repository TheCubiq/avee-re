.class public final synthetic Lcom/daaw/qj5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/nl3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/nl3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qj5;->a:Lcom/daaw/nl3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj5;->a:Lcom/daaw/nl3;

    check-cast p1, Lorg/json/JSONObject;

    invoke-interface {v0, p1}, Lcom/daaw/nl3;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
