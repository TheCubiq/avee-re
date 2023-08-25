.class public final synthetic Lcom/daaw/km;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gi;


# instance fields
.field public final synthetic a:Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/km;->a:Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/km;->a:Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    invoke-static {v0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Lcom/daaw/bi;)Lcom/daaw/x10;

    move-result-object p1

    return-object p1
.end method
