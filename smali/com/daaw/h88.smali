.class public final Lcom/daaw/h88;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v78;


# instance fields
.field public final a:Lcom/daaw/kr8;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/List;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/daaw/rr8;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/kr8;

    invoke-direct {v0, p1, p2}, Lcom/daaw/kr8;-><init>(Lcom/daaw/rr8;Z)V

    iput-object v0, p0, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/h88;->c:Ljava/util/List;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h88;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/h88;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/h88;->e:Z

    iget-object p1, p0, Lcom/daaw/h88;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final zza()Lcom/daaw/l64;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v0}, Lcom/daaw/kr8;->I()Lcom/daaw/l64;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h88;->b:Ljava/lang/Object;

    return-object v0
.end method
