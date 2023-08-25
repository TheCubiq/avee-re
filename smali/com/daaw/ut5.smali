.class public final synthetic Lcom/daaw/ut5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/zt5;

.field public final synthetic b:Lcom/daaw/f77;

.field public final synthetic c:Lcom/daaw/f77;

.field public final synthetic d:Lcom/daaw/fi6;

.field public final synthetic e:Lcom/daaw/th6;

.field public final synthetic f:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/zt5;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ut5;->a:Lcom/daaw/zt5;

    iput-object p2, p0, Lcom/daaw/ut5;->b:Lcom/daaw/f77;

    iput-object p3, p0, Lcom/daaw/ut5;->c:Lcom/daaw/f77;

    iput-object p4, p0, Lcom/daaw/ut5;->d:Lcom/daaw/fi6;

    iput-object p5, p0, Lcom/daaw/ut5;->e:Lcom/daaw/th6;

    iput-object p6, p0, Lcom/daaw/ut5;->f:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/daaw/ut5;->a:Lcom/daaw/zt5;

    iget-object v1, p0, Lcom/daaw/ut5;->b:Lcom/daaw/f77;

    iget-object v2, p0, Lcom/daaw/ut5;->c:Lcom/daaw/f77;

    iget-object v3, p0, Lcom/daaw/ut5;->d:Lcom/daaw/fi6;

    iget-object v4, p0, Lcom/daaw/ut5;->e:Lcom/daaw/th6;

    iget-object v5, p0, Lcom/daaw/ut5;->f:Lorg/json/JSONObject;

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/zt5;->c(Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)Lcom/daaw/e35;

    move-result-object v0

    return-object v0
.end method
