.class public final Lcom/daaw/r86;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/pm/PackageInfo;

.field public final d:Lcom/daaw/hz3;


# direct methods
.method public constructor <init>(Lcom/daaw/hz3;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/content/pm/PackageInfo;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r86;->d:Lcom/daaw/hz3;

    iput-object p2, p0, Lcom/daaw/r86;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/r86;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/r86;->c:Landroid/content/pm/PackageInfo;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Throwable;)Lcom/daaw/f77;
    .locals 1

    new-instance p1, Lcom/daaw/s86;

    iget-object v0, p0, Lcom/daaw/r86;->b:Ljava/lang/String;

    invoke-direct {p1, v0}, Lcom/daaw/s86;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x29

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/r86;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/p86;->a:Lcom/daaw/p86;

    iget-object v2, p0, Lcom/daaw/r86;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/q86;

    invoke-direct {v1, p0}, Lcom/daaw/q86;-><init>(Lcom/daaw/r86;)V

    const-class v2, Ljava/lang/Throwable;

    iget-object v3, p0, Lcom/daaw/r86;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1, v3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
