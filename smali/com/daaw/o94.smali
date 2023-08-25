.class public final Lcom/daaw/o94;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/e94;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/e94;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o94;->a:Lcom/daaw/e94;

    iput-object p2, p0, Lcom/daaw/o94;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/o94;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ya5;

    new-instance v1, Lcom/daaw/lv5;

    invoke-direct {v1, v0}, Lcom/daaw/lv5;-><init>(Lcom/daaw/ya5;)V

    return-object v1
.end method
