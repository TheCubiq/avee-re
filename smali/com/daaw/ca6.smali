.class public final synthetic Lcom/daaw/ca6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h76;


# instance fields
.field public final synthetic a:Lcom/daaw/da6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/da6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ca6;->a:Lcom/daaw/da6;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ca6;->a:Lcom/daaw/da6;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/daaw/da6;->a(Lorg/json/JSONObject;)V

    return-void
.end method
