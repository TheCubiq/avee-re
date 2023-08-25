.class public final Lcom/daaw/cx4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/pw4;


# direct methods
.method public constructor <init>(Lcom/daaw/pw4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cx4;->a:Lcom/daaw/pw4;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cx4;->a:Lcom/daaw/pw4;

    invoke-virtual {v0}, Lcom/daaw/pw4;->l()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
