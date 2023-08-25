.class public final Lcom/daaw/ej8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e48;


# static fields
.field public static final q:Lcom/daaw/ej8;


# instance fields
.field public final p:Lcom/daaw/e48;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ej8;

    invoke-direct {v0}, Lcom/daaw/ej8;-><init>()V

    sput-object v0, Lcom/daaw/ej8;->q:Lcom/daaw/ej8;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/daaw/ij8;

    invoke-direct {v0}, Lcom/daaw/ij8;-><init>()V

    invoke-static {v0}, Lcom/daaw/q48;->b(Ljava/lang/Object;)Lcom/daaw/e48;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/daaw/q48;->a(Lcom/daaw/e48;)Lcom/daaw/e48;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ej8;->p:Lcom/daaw/e48;

    return-void
.end method

.method public static a()J
    .locals 2

    sget-object v0, Lcom/daaw/ej8;->q:Lcom/daaw/ej8;

    invoke-virtual {v0}, Lcom/daaw/ej8;->b()Lcom/daaw/gj8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/gj8;->zza()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final b()Lcom/daaw/gj8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ej8;->p:Lcom/daaw/e48;

    invoke-interface {v0}, Lcom/daaw/e48;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gj8;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ej8;->b()Lcom/daaw/gj8;

    move-result-object v0

    return-object v0
.end method
