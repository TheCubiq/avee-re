.class public final Lcom/daaw/y26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y26;->a:Lcom/daaw/m08;

    return-void
.end method

.method public static final a()Lcom/daaw/w26;
    .locals 2

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/w26;

    invoke-direct {v1, v0}, Lcom/daaw/w26;-><init>(Lcom/daaw/g77;)V

    return-object v1
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/daaw/y26;->a()Lcom/daaw/w26;

    move-result-object v0

    return-object v0
.end method
