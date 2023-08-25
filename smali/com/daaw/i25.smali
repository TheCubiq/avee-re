.class public final Lcom/daaw/i25;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/h25;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/h25;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i25;->a:Lcom/daaw/h25;

    iput-object p2, p0, Lcom/daaw/i25;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/i25;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/k25;

    invoke-virtual {v0}, Lcom/daaw/k25;->a()Lcom/daaw/o35;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/o35;->c()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
