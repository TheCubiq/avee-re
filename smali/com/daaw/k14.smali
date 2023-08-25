.class public final Lcom/daaw/k14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/i14;

.field public final synthetic b:Lcom/daaw/g14;


# direct methods
.method public constructor <init>(Lcom/daaw/l14;Lcom/daaw/i14;Lcom/daaw/g14;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/k14;->a:Lcom/daaw/i14;

    iput-object p3, p0, Lcom/daaw/k14;->b:Lcom/daaw/g14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/k14;->a:Lcom/daaw/i14;

    invoke-interface {v0, p1}, Lcom/daaw/i14;->zza(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/k14;->b:Lcom/daaw/g14;

    invoke-interface {p1}, Lcom/daaw/g14;->zza()V

    return-void
.end method
