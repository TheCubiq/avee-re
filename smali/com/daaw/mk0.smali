.class public abstract Lcom/daaw/mk0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/daaw/sj0;)Lcom/daaw/mk0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/daaw/sj0;",
            ":",
            "Lcom/daaw/nt1;",
            ">(TT;)",
            "Lcom/daaw/mk0;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/nk0;

    move-object v1, p0

    check-cast v1, Lcom/daaw/nt1;

    invoke-interface {v1}, Lcom/daaw/nt1;->g()Lcom/daaw/mt1;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/daaw/nk0;-><init>(Lcom/daaw/sj0;Lcom/daaw/mt1;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract c()V
.end method
