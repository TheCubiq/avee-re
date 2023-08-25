.class public final Lcom/daaw/uw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hi0;


# static fields
.field public static final a:Lcom/daaw/uw;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/uw;

    invoke-direct {v0}, Lcom/daaw/uw;-><init>()V

    sput-object v0, Lcom/daaw/uw;->a:Lcom/daaw/uw;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/daaw/uw;
    .locals 1

    sget-object v0, Lcom/daaw/uw;->a:Lcom/daaw/uw;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method
