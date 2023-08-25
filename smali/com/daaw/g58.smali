.class public final Lcom/daaw/g58;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v78;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lcom/daaw/l64;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/daaw/l64;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g58;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/g58;->b:Lcom/daaw/l64;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/g58;Lcom/daaw/l64;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g58;->b:Lcom/daaw/l64;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/l64;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g58;->b:Lcom/daaw/l64;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g58;->a:Ljava/lang/Object;

    return-object v0
.end method
