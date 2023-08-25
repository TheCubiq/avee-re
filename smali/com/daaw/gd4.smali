.class public final Lcom/daaw/gd4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mh6;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public b:Landroid/content/Context;

.field public c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/fd4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gd4;->a:Lcom/daaw/bb4;

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;)Lcom/daaw/mh6;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/gd4;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final synthetic zza(Ljava/lang/String;)Lcom/daaw/mh6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/gd4;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final zzc()Lcom/daaw/nh6;
    .locals 5

    iget-object v0, p0, Lcom/daaw/gd4;->b:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/id4;

    iget-object v1, p0, Lcom/daaw/gd4;->a:Lcom/daaw/bb4;

    iget-object v2, p0, Lcom/daaw/gd4;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/gd4;->c:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/id4;-><init>(Lcom/daaw/bb4;Landroid/content/Context;Ljava/lang/String;Lcom/daaw/hd4;)V

    return-object v0
.end method
