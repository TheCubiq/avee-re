.class public Lcom/daaw/nk0;
.super Lcom/daaw/mk0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/nk0$b;,
        Lcom/daaw/nk0$a;
    }
.end annotation


# static fields
.field public static c:Z


# instance fields
.field public final a:Lcom/daaw/sj0;

.field public final b:Lcom/daaw/nk0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/daaw/sj0;Lcom/daaw/mt1;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/mk0;-><init>()V

    iput-object p1, p0, Lcom/daaw/nk0;->a:Lcom/daaw/sj0;

    invoke-static {p2}, Lcom/daaw/nk0$b;->f(Lcom/daaw/mt1;)Lcom/daaw/nk0$b;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/nk0;->b:Lcom/daaw/nk0$b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/nk0;->b:Lcom/daaw/nk0$b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/nk0$b;->e(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk0;->b:Lcom/daaw/nk0$b;

    invoke-virtual {v0}, Lcom/daaw/nk0$b;->g()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/nk0;->a:Lcom/daaw/sj0;

    invoke-static {v1, v0}, Lcom/daaw/bq;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
