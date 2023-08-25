.class public final Lcom/daaw/bx4;
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

    iput-object p1, p0, Lcom/daaw/bx4;->a:Lcom/daaw/pw4;

    return-void
.end method

.method public static a(Lcom/daaw/pw4;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/pw4;->k()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bx4;->a:Lcom/daaw/pw4;

    invoke-virtual {v0}, Lcom/daaw/pw4;->k()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
